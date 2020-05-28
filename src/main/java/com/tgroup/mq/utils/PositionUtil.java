package com.tgroup.mq.utils;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * 各地图API坐标系统比较与转换;
 * WGS84坐标系：即地球坐标系，国际上通用的坐标系。设备一般包含GPS芯片或者北斗芯片获取的经纬度为WGS84地理坐标系,
 * 谷歌地图采用的是WGS84地理坐标系（中国范围除外）;
 * GCJ02坐标系：即火星坐标系，是由中国国家测绘局制订的地理信息系统的坐标系统。由WGS84坐标系经加密后的坐标系。
 * 谷歌中国地图和搜搜中国地图采用的是GCJ02地理坐标系; BD09坐标系：即百度坐标系，GCJ02坐标系经加密后的坐标系;
 * 搜狗坐标系、图吧坐标系等，估计也是在GCJ02基础上加密而成的。 chenhua
 */
public class PositionUtil {
    
    public static final String BAIDU_LBS_TYPE = "bd09ll";
    
    public static double pi = 3.1415926535897932384626;
    public static double a = 6378245.0;
    public static double ee = 0.00669342162296594323;
    
    /**
     * 84 to 火星坐标系 (GCJ-02) World Geodetic System ==> Mars Geodetic System
     * 
     * @param lat
     * @param lon
     * @return
     */
    public static Coordinate gps84_To_Gcj02(double lat, double lon) {
        if (outOfChina(lat, lon)) {
            return null;
        }
        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;
        return new Coordinate(mgLat, mgLon);
    }
    
    /**
     * * 火星坐标系 (GCJ-02) to 84 * * @param lon * @param lat * @return
     */
    public static Coordinate gcj_To_Gps84(double lat, double lon) {
        Coordinate gps = transform(lat, lon);
        double lontitude = lon * 2 - gps.getWgLng();
        double latitude = lat * 2 - gps.getWgLat();
        return new Coordinate(latitude, lontitude);
    }
    
    /**
     * 火星坐标系 (GCJ-02) 与百度坐标系 (BD-09) 的转换算法 将 GCJ-02 坐标转换成 BD-09 坐标
     * 
     * @param gg_lat
     * @param gg_lon
     */
    public static Coordinate gcj02_To_Bd09(double gg_lat, double gg_lon) {
        double x = gg_lon, y = gg_lat;
        double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * pi);
        double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * pi);
        double bd_lon = z * Math.cos(theta) + 0.0065;
        double bd_lat = z * Math.sin(theta) + 0.006;
        return new Coordinate(bd_lat, bd_lon);
    }
    
    /**
     * * 火星坐标系 (GCJ-02) 与百度坐标系 (BD-09) 的转换算法 * * 将 BD-09 坐标转换成GCJ-02 坐标 *
     * * @param bd_lat * @param bd_lon * @return
     */
    public static Coordinate bd09_To_Gcj02(double bd_lat, double bd_lon) {
        double x = bd_lon - 0.0065, y = bd_lat - 0.006;
        double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * pi);
        double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * pi);
        double gg_lon = z * Math.cos(theta);
        double gg_lat = z * Math.sin(theta);
        return new Coordinate(gg_lat, gg_lon);
    }
    
    /**
     * (BD-09)-->84
     * 
     * @param bd_lat
     * @param bd_lon
     * @return
     */
    public static Coordinate bd09_To_Gps84(double bd_lat, double bd_lon) {
        
        Coordinate gcj02 = PositionUtil.bd09_To_Gcj02(bd_lat, bd_lon);
        Coordinate map84 = PositionUtil.gcj_To_Gps84(gcj02.getWgLat(), gcj02.getWgLng());
        return map84;
        
    }
    
    public static boolean outOfChina(double lat, double lon) {
        if (lon < 72.004 || lon > 137.8347)
            return true;
        if (lat < 0.8293 || lat > 55.8271)
            return true;
        return false;
    }
    
    public static Coordinate transform(double lat, double lon) {
        if (outOfChina(lat, lon)) {
            return new Coordinate(lat, lon);
        }
        double dLat = transformLat(lon - 105.0, lat - 35.0);
        double dLon = transformLon(lon - 105.0, lat - 35.0);
        double radLat = lat / 180.0 * pi;
        double magic = Math.sin(radLat);
        magic = 1 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = (dLat * 180.0) / ((a * (1 - ee)) / (magic * sqrtMagic) * pi);
        dLon = (dLon * 180.0) / (a / sqrtMagic * Math.cos(radLat) * pi);
        double mgLat = lat + dLat;
        double mgLon = lon + dLon;
        return new Coordinate(mgLat, mgLon);
    }
    
    public static double transformLat(double x, double y) {
        double ret = -100.0 + 2.0 * x + 3.0 * y + 0.2 * y * y + 0.1 * x * y + 0.2 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(y * pi) + 40.0 * Math.sin(y / 3.0 * pi)) * 2.0 / 3.0;
        ret += (160.0 * Math.sin(y / 12.0 * pi) + 320 * Math.sin(y * pi / 30.0)) * 2.0 / 3.0;
        return ret;
    }
    
    public static double transformLon(double x, double y) {
        double ret = 300.0 + x + 2.0 * y + 0.1 * x * x + 0.1 * x * y + 0.1 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * pi) + 20.0 * Math.sin(2.0 * x * pi)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(x * pi) + 40.0 * Math.sin(x / 3.0 * pi)) * 2.0 / 3.0;
        ret += (150.0 * Math.sin(x / 12.0 * pi) + 300.0 * Math.sin(x / 30.0 * pi)) * 2.0 / 3.0;
        return ret;
    }
    
    /**
     * 计算地球上任意两点(经纬度)距离
     * 
     * @param lng1
     *            第一点经度x
     * @param lat1
     *            第一点纬度y
     * @param lng2
     *            第二点经度x
     * @param lat2
     *            第二点纬度y
     * @return 返回距离 单位：米
     */
    public static double getDistance(double lng1, double lat1, double lng2, double lat2) {
        double a, b, R;
        R = 6378137; // 地球半径
        lat1 = lat1 * Math.PI / 180.0;
        lat2 = lat2 * Math.PI / 180.0;
        a = lat1 - lat2;
        b = (lng1 - lng2) * Math.PI / 180.0;
        double d;
        double sa2, sb2;
        sa2 = Math.sin(a / 2.0);
        sb2 = Math.sin(b / 2.0);
        d = 2 * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1) * Math.cos(lat2) * sb2 * sb2));
        return d;
    }
    
    /**
     * 计算点到线的距离
     * 
     * @param lineA
     *            线起点坐标
     * @param lineB
     *            线终点坐标
     * @param point
     *            点坐标
     * @return
     */
    public static double pointToLine(Point2D.Double point, Point2D.Double lineA, Point2D.Double lineB) {
        double space = 0;
        double a, b, c;
        a = getDistance(lineA.x, lineA.y, lineB.x, lineB.y);// 线段的长度
        b = getDistance(lineA.x, lineA.y, point.x, point.y);// 点到起点在长度
        c = getDistance(lineB.x, lineB.y, point.x, point.y);// 点到终点的长度
        // 点在起终点附近
        if (c <= 0.000001 || b <= 0.000001) {
            space = 0;
            return space;
        }
        
        // 点在线段上
        if (c + b == a) {
            space = 0;
            return space;
        }
        
        // 不是线段，是一个点
        if (a <= 0.000001) {
            space = b;
            return space;
        }
        
        // 与起点组成直角三角形或钝角三角形
        if (c * c >= a * a + b * b) {
            space = b;
            return space;
        }
        
        // 与终点组成直角三角形或钝角三角形
        if (b * b >= a * a + c * c) {
            space = c;
            return space;
        }
        // 锐三角求垂直高度
        double p = (a + b + c) / 2;// 半周长
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));// 海伦公式求面积
        space = 2 * s / a;// 返回点到线的距离（利用三角形面积公式求高）
        return space;
    }
    
    /**
     * 判断点是否在多边形内
     * 
     * @param point
     *            检测点
     * @param pts
     *            多边形的顶点
     * @return 点在多边形内返回true,否则返回false
     */
    public static boolean isPtInPoly(Point2D.Double point, List<Point2D.Double> pts) {
        
        int N = pts.size();
        boolean boundOrVertex = true; // 如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
        int intersectCount = 0;// cross points count of x
        double precision = 2e-10; // 浮点类型计算时候与0比较时候的容差
        Point2D.Double p1, p2;// neighbour bound vertices
        Point2D.Double p = point; // 当前点
        
        p1 = pts.get(0);// left vertex
        for (int i = 1; i <= N; ++i) {// check all rays
            if (p.equals(p1)) {
                return boundOrVertex;// p is an vertex
            }
            
            p2 = pts.get(i % N);// right vertex
            if (p.x < Math.min(p1.x, p2.x) || p.x > Math.max(p1.x, p2.x)) {// ray
                                                                           // is
                                                                           // outside
                                                                           // of
                                                                           // our
                                                                           // interests
                p1 = p2;
                continue;// next ray left point
            }
            
            if (p.x > Math.min(p1.x, p2.x) && p.x < Math.max(p1.x, p2.x)) {// ray
                                                                           // is
                                                                           // crossing
                                                                           // over
                                                                           // by
                                                                           // the
                                                                           // algorithm
                                                                           // (common
                                                                           // part
                                                                           // of)
                if (p.y <= Math.max(p1.y, p2.y)) {// x is before of ray
                    if (p1.x == p2.x && p.y >= Math.min(p1.y, p2.y)) {// overlies
                                                                      // on a
                                                                      // horizontal
                                                                      // ray
                        return boundOrVertex;
                    }
                    
                    if (p1.y == p2.y) {// ray is vertical
                        if (p1.y == p.y) {// overlies on a vertical ray
                            return boundOrVertex;
                        } else {// before ray
                            ++intersectCount;
                        }
                    } else {// cross point on the left side
                        double xinters = (p.x - p1.x) * (p2.y - p1.y) / (p2.x - p1.x) + p1.y;// cross
                                                                                             // point
                                                                                             // of
                                                                                             // y
                        if (Math.abs(p.y - xinters) < precision) {// overlies on
                                                                  // a ray
                            return boundOrVertex;
                        }
                        
                        if (p.y < xinters) {// before ray
                            ++intersectCount;
                        }
                    }
                }
            } else {// special case when ray is crossing through the vertex
                if (p.x == p2.x && p.y <= p2.y) {// p crossing over p2
                    Point2D.Double p3 = pts.get((i + 1) % N); // next vertex
                    if (p.x >= Math.min(p1.x, p3.x) && p.x <= Math.max(p1.x, p3.x)) {// p.x
                                                                                     // lies
                                                                                     // between
                                                                                     // p1.x
                                                                                     // &
                                                                                     // p3.x
                        ++intersectCount;
                    } else {
                        intersectCount += 2;
                    }
                }
            }
            p1 = p2;// next ray left point
        }
        
        if (intersectCount % 2 == 0) {// 偶数在多边形外
            return false;
        } else { // 奇数在多边形内
            return true;
        }
        
    }
    
    /**
     * 判断点是否在圆内
     * 
     * @param point1
     *            检测点
     * @param point2
     *            圆中心点
     * @param radius
     *            半径
     * @return 点在多边形内返回true,否则返回false
     */
    public static boolean isPtInRound(Coordinate point1, Coordinate point2, double radius) {
        return getDistance(point1.getWgLng(), point1.getWgLat(), point2.getWgLng(), point2.getWgLat()) <= radius;
    }
    
    // public static void main(String[] args) {
    //
    // // 北斗芯片获取的经纬度为WGS84地理坐标 31.426896,119.496145
    // Coordinate gps = new Coordinate(31.426896, 119.496145);
    // System.out.println("gps :" + gps);
    // Coordinate gcj = gps84_To_Gcj02(gps.getWgLat(), gps.getWgLng());
    // System.out.println("gcj :" + gcj);
    // Coordinate star = gcj_To_Gps84(gcj.getWgLat(), gcj.getWgLng());
    // System.out.println("star:" + star);
    // Coordinate bd = gcj02_To_Bd09(gcj.getWgLat(), gcj.getWgLng());
    // System.out.println("bd :" + bd);
    // Coordinate gcj2 = bd09_To_Gcj02(bd.getWgLat(), bd.getWgLng());
    // System.out.println("gcj :" + gcj2);
    //
    // System.out.println(getDistance(100.40729, 13.87161, 113.92737,
    // 22.54301));
    //
    // // Point2D.Double point = new Point2D.Double(116.395, 39.910);
    // //
    // // List<Point2D.Double> pts = new ArrayList<Point2D.Double>();
    // // pts.add(new Point2D.Double(116.395, 39.910));
    // // pts.add(new Point2D.Double(116.394, 39.914));
    // // pts.add(new Point2D.Double(116.403, 39.920));
    // // pts.add(new Point2D.Double(116.402, 39.914));
    // // pts.add(new Point2D.Double(116.410, 39.913));
    // //
    // // if(IsPtInPoly(point, pts)){
    // // System.out.println("点在多边形内");
    // // }else{
    // // System.out.println("点在多边形外");
    // }
}