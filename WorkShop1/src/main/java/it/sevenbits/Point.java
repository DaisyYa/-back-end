package it.sevenbits;

/**
 *
 */
public class Point {
    private int x;
    private int y;

    /**
     *
     * @param x giy
     * @param y gjg
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    private Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }
}
