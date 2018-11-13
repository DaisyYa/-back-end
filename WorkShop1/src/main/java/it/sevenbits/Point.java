package it.sevenbits;

/**
 * class describing the point
 */
public class Point {
    private int x;
    private int y;

    /**
     * point creation
     * @param x coordinate
     * @param y coordinate
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
