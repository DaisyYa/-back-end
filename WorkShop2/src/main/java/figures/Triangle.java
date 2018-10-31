package figures;

/**
 * class with methods getPerimetr, toString (forTriangle)
 */
public class Triangle implements IPolygon {
    private int lengthA;
    private int lengthB;
    private int lengthC;

    /**
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
     *
     * @return perimetr of triangle
     */
    public int getPerimetr() {
            return lengthA + lengthB + lengthC;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triangle{lengthA=" + lengthA + ", lengthB=" + lengthB + ", lengthC=" + lengthC + ";");
        return String.valueOf(stringBuilder);
    }
}
