package it.sevenbits.figures;

import it.sevenbits.figures.exceptions.TriangleException;

import java.io.*;
import java.util.ArrayList;

/**
 * create object (IPolygon)
 */
public class PolygonFactory {
    /**
     * create Triangle
     * @param lengthA sideA
     * @param lengthB sideB
     * @param lengthC sideC
     * @return Triangle
     * @throws TriangleException if Triangle does is not exist
     */
    public Triangle getTriangle(final int lengthA, final int lengthB, final int lengthC) throws TriangleException {
        return new Triangle(lengthA, lengthB, lengthC);
    }

    /**
     * create Quadrilateral
     *
     * @param lengthA sideA
     * @param lengthB sideB
     * @param lengthC sideC
     * @param lengthD sideD
     * @return Quadrilateral
     */
    public Quadrilateral getQuadrilateral(final int lengthA, final int lengthB, final int lengthC, final int lengthD) {
        return new Quadrilateral(lengthA, lengthB, lengthC, lengthD);
    }

    /**
     * finds figures and writes them to the list
     *
     * @param file file
     * @return ArrayList
     * @throws TriangleException if Triangle does is not exis
     */
    public ArrayList getPolygonsFromFile(final File file) throws TriangleException {
        ArrayList<IPolygon> arrayList = new ArrayList<>();
        ArrayList<String> arrayListStr = new ArrayList<>();
        String str;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((str = bufferedReader.readLine()) != null) {
                arrayListStr.add(str);
            }
        } catch (IOException e) {
            System.out.println("Error! File not found");
        }
        if (arrayListStr.size() != 0) {
            for (String string : arrayListStr) {
                String[] strings = string.split(" ");
                switch (strings.length) {
                    case 3:
                        arrayList.add(getTriangle(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]),
                                Integer.parseInt(strings[2])));
                        break;
                    case 4:
                        arrayList.add(getQuadrilateral(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]),
                                Integer.parseInt(strings[2]), Integer.parseInt(strings[3])));
                        break;
                    default:
                        System.out.println("Error! side not found");
                }
            }
        } else {
            throw new NullPointerException("File is empty");
        }
        return arrayList;
    }
}
