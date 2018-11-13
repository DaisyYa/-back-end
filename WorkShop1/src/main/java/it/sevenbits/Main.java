package it.sevenbits;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    /**
     * main method
     * @param arg array of strings
     */
    public static void main(final String[] arg) {
        Random random = new Random();
        ArrayList<Segment> segments = new ArrayList<Segment>();
        StringBuilder sbLength = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        int n = random.nextInt(20);
        for (int i = 0; i < n; i++) {
            Segment segment = new Segment(new Point(random.nextInt(10), random.nextInt(10)),
                                         new Point(random.nextInt(10), random.nextInt(10)));
            segments.add(segment);
        }
        Segment maxLengthOfSegment = segments.get(0);
        for (Segment segment:segments) {
            sbLength.append(segment.getLengthOfSegment(segment.getA(), segment.getB()) + "\n");
            if (segment.getLengthOfSegment(segment.getA(), segment.getB()) > maxLengthOfSegment.getLengthOfSegment(maxLengthOfSegment.getA(), maxLengthOfSegment.getB())) {
                maxLengthOfSegment = segment;
            }
        }
        System.out.println(sbLength);
        System.out.println("MaxLength:" + maxLengthOfSegment.getLengthOfSegment(maxLengthOfSegment.getA(), maxLengthOfSegment.getB()));
        Point pointC = new Point(random.nextInt(10), random.nextInt(10));
        System.out.println("Point C (" + pointC.getX() + "," + pointC.getY() + ") lies on the segments");
        for (Segment segment:segments) {
            stringBuilder.append(segment.cheekPointOnSegment(pointC) + "\n");
        }
        System.out.println(stringBuilder);
    }
}
