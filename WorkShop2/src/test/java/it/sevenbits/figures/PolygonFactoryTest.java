package it.sevenbits.figures;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

public class PolygonFactoryTest {

    @Test
    public void getPolygonsFromFileTest() {
        File file = new File("src/test/resources/file.txt");
        PolygonFactory polygonFactory = new PolygonFactory();
        ArrayList<IPolygon> arrayList = new ArrayList<>();
        arrayList.add(polygonFactory.getTriangle(3, 3, 3));
        arrayList.add(polygonFactory.getQuadrilateral(8, 5, 4, 7));
        arrayList.add(polygonFactory.getTriangle(2, 2, 2));
        Assert.assertEquals(Triangle.class, polygonFactory.getPolygonsFromFile(file).get(0).getClass());
        Assert.assertEquals(Quadrilateral.class, polygonFactory.getPolygonsFromFile(file).get(1).getClass());
        Assert.assertEquals(Triangle.class, polygonFactory.getPolygonsFromFile(file).get(2).getClass());
    }
}
