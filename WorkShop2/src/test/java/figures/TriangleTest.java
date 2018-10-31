package figures;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TriangleTest {
    private Triangle triangle;

    @Test
    public void triangleDoesNotExistTest() {
        try {
            triangle = new Triangle(5, 1, 2);
            fail();
        } catch (TriangleException e) {
            Assert.assertNotEquals("",e.getMessage());
        }
    }
}
