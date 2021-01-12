package com.dukk;

import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.opengis.geometry.BoundingBox;
import org.opengis.geometry.DirectPosition;
import org.opengis.referencing.crs.CoordinateReferenceSystem;

/**
 * 边界
 */
public class ReferencedEnvelopeTest {

    public static void main(String[] args) {



        ReferencedEnvelope envelope = new ReferencedEnvelope(0, 10, 0, 20, DefaultGeographicCRS.WGS84);

        double xMin = envelope.getMinX();
        double yMin = envelope.getMinY();

        double xMax = envelope.getMaxX();
        double yMax = envelope.getMaxY();

        double width = envelope.getWidth();
        double height = envelope.getHeight();

        double xCenter = envelope.getMedian(0);
        double yCenter = envelope.getMedian(1);

        CoordinateReferenceSystem crs = envelope.getCoordinateReferenceSystem();
        int dimension = envelope.getDimension();

        // Direct access to internal upper and lower positions
        DirectPosition lower = envelope.getLowerCorner();
        DirectPosition upper = envelope.getUpperCorner();

        // expand to include 15, 30
        envelope.include(15, 30);

        envelope.isEmpty(); // check if storing width and height are 0

        envelope.isNull(); // check if "null" (not storing anything)
        envelope.setToNull();

    }
}
