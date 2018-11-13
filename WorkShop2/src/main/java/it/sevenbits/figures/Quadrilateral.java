package it.sevenbits.figures;

/**
 * class with methods getPerimeter, toString (for Quadrilateral)
 */
public class Quadrilateral  implements IPolygon {
    private int lengthA;
    private int lengthB;
    private int lengthC;
    private int lengthD;

    /**
     *
     * @param lengthA side 1
     * @param lengthB side 2
     * @param lengthC side 3
     * @param lengthD side 4
     */
    public Quadrilateral(final int lengthA, final int lengthB, final int lengthC, final int lengthD) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.lengthD = lengthD;
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

    public int getLengthD() {
        return lengthD;
    }

    public void setLengthD(final int lengthD) {
        this.lengthD = lengthD;
    }

    /**
     * method calc perimeter of quardrilateral
     * @return Perimetr of quardrilateral
     */
    public int getPerimeter() {
        return getLengthA() + getLengthB() + getLengthC() + getLengthD();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Quardrilateral{lengthA=").append(lengthA).append(", lengthB=").append(lengthB)
                .append(", lengthC=").append(lengthC).append(", lengthD=").append(lengthD).append("};");
        return String.valueOf(stringBuilder);
    }
}
