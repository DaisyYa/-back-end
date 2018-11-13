package it.sevenbits.figures;


import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralTest {
    private Quadrilateral quadrilateral;

    @Test
    public void getPerimeterTest() {
        quadrilateral = new Quadrilateral(4, 5, 7, 1);
        Assert.assertEquals(17, quadrilateral.getPerimeter());
    }
}
