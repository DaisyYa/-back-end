package it.sevenbits.figures;

import it.sevenbits.figures.exceptions.TriangleException;
import org.junit.Test;

public class TriangleTest {
    private static Triangle triangle;

    @Test(expected = TriangleException.class)
    public void triangleDoesNotExistTest() throws TriangleException {
        triangle = new Triangle(5, 1, 2);
    }
}
