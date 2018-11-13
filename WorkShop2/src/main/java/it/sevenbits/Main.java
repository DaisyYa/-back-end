package it.sevenbits;

import it.sevenbits.figures.exceptions.TriangleException;
import it.sevenbits.figures.IPolygon;
import it.sevenbits.figures.Quadrilateral;
import it.sevenbits.figures.Triangle;

/**
 * class with main method
 */
public class Main {
    /**
     *
     * @param args array of strings
     */
    public static void main(final String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            IPolygon triangle = new Triangle(5, 4, 5);
            stringBuilder.append(triangle.toString()).append("\nPerimeter: ").append(triangle.getPerimeter());
        } catch (TriangleException e) {
           System.out.println("Error! Triangle does is not exist!");
        }
        IPolygon quadrilateral = new Quadrilateral(10, 8, 5, 7);
        stringBuilder.append("\n").append(quadrilateral.toString()).append("\nPerimeter: ").append(quadrilateral.getPerimeter());
        System.out.println(stringBuilder);
    }
}
