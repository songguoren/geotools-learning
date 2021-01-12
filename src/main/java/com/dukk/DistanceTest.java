package com.dukk;

import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;

public class DistanceTest {

    public static void main(String[] args) throws FactoryException, ParseException {
        CoordinateReferenceSystem crs = CRS.decode("EPSG:3005");


        Geometry point = new WKTReader().read("POINT (116.39622 40.027074)");
        point.setSRID(3005);

        Geometry point1 = new WKTReader().read("POINT (116.512353 39.821234)");
        point1.setSRID(3005);

        point.distance(point1);




    }
}
