package figures;

/**
 * class with methods getPerimetr, toString (for Quadrilateral)
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
     *
     * @return Perimetr of quardrilateral
     */
    public int getPerimetr() {
        return getLengthA() + getLengthB() + getLengthC() + getLengthD();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Quardrilateral{lengthA=" + lengthA + ", lengthB=" + lengthB + ", lengthC=" + lengthC +
                ", lengthD=" + lengthD + "};");
        return String.valueOf(stringBuilder);
    }
}
