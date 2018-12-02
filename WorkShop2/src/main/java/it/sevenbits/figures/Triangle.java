package it.sevenbits.figures;

import it.sevenbits.figures.exceptions.TriangleException;

/**
 * class with methods getPerimeter, toString (forTriangle)
 */
public class Triangle implements IPolygon {
    private int lengthA;
    private int lengthB;
    private int lengthC;

    /**
     * create triangle
     *
     * @param lengthA side 1
     * @param lengthB side 2
     * @param lengthC side 3
     * @throws TriangleException catch exception if triangle does is not exist
     */
    public Triangle(final int lengthA, final int lengthB, final int lengthC) throws TriangleException {
        if (lengthA < lengthB + lengthC && lengthB < lengthA + lengthC && lengthC < lengthA + lengthB) {
            this.lengthA = lengthA;
            this.lengthB = lengthB;
            this.lengthC = lengthC;
        } else {
            throw new TriangleException("Error! Triangle does is not exist!");
        }
    }

    private Triangle() {
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(final int lengthA) {
        this.lengthA = lengthA;
    }

    public int getLengthB() {
        return lengthB;
    }

    public void setLengthB(final int lengthB) {
        this.lengthB = lengthB;
    }

    public int getLengthC() {
        return lengthC;
    }

    public void setLengthC(final int lengthC) {
        this.lengthC = lengthC;
    }

    /**
     * method calc perimeter of triangle
     *
     * @return perimetr of triangle
     */
    public int getPerimeter() {
        return lengthA + lengthB + lengthC;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triangle{lengthA=").append(lengthA).append(", lengthB=").append(lengthB)
                .append(", lengthC=").append(lengthC).append("};");
        return String.valueOf(stringBuilder);
    }
}
