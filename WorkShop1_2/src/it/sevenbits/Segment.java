package it.sevenbits;

public class Segment {
    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    private Segment() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double getLengthOfSegment(Point a, Point b){
        return Math.sqrt( Math.pow( a.getX()-a.getY(),2 )+Math.pow( b.getX()-b.getY(),2 ) );
    }

    public boolean cheekPointOnSegment(Point c){
        return (getA().getX()-getB().getX())*(getA().getY()-c.getY())==(getA().getX()-c.getX())*(getA().getY()-getB().getY());
    }
}
