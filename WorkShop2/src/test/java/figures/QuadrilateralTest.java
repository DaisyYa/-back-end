package figures;


import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralTest {
    private Quadrilateral quadrilateral;

    @Test
    public void getPerimetrTest() {
        quadrilateral = new Quadrilateral(4, 5, 7, 1);
        int perimetr = 17;
        Assert.assertEquals(perimetr, quadrilateral.getPerimetr());
    }
}
