package com.dukk;

import org.geotools.data.DataUtilities;
import org.geotools.feature.FeatureTypes;
import org.geotools.feature.SchemaException;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
import org.geotools.geometry.jts.JTS;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.feature.type.FeatureType;

public class FeatureTest {

    public static void main(String[] args) throws SchemaException {

        GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();

       /* SimpleFeatureType featureType = DataUtilities.createType(
                "Location",
                "the_geom:Point:srid=4326,"
                        + // <- the geometry attribute: Point type
                        "name:String,"
                        + // <- a String attribute
                        "number:Integer" // a number attribute
        );*/


        //设置scheme
        SimpleFeatureTypeBuilder b = new SimpleFeatureTypeBuilder();
        b.setName("poiTable");
        b.setCRS(DefaultGeographicCRS.WGS84);
        b.add("name", String.class);
        b.add("location", Point.class);

        SimpleFeatureType typeScheme = b.buildFeatureType();


        SimpleFeatureBuilder featureBuilder  = new SimpleFeatureBuilder( typeScheme );

        //存储数据
        Point point = geometryFactory.createPoint(new Coordinate(116.39622 ,40.027074));
        featureBuilder.set("location", point);
        featureBuilder.set("name", "五台山");

        //生成对象
        SimpleFeature simpleFeature = featureBuilder.buildFeature("010101");


        //对象使用
        Point point1 = (Point)simpleFeature.getAttribute("location");

        System.out.println(point1.toText());

        Polygon polygon = geometryFactory.createPolygon();

        polygon.getCentroid();







    }
}
