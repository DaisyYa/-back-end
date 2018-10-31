package figures;

/**
 * class with main method
 */
public class Main {
    /**
     *
     * @param args array of strings
     */
    public static void main(final String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Triangle triangle = new Triangle(5, 4, 5);
            stringBuilder.append(triangle.toString()).append("\nPerimetr: " + triangle.getPerimetr());
        } catch (TriangleException e) {
            e.printStackTrace();
        }
        Quadrilateral quadrilateral = new Quadrilateral(10, 8, 5, 7);
        stringBuilder.append("\n" + quadrilateral.toString()).append("\nPerimetr: " + quadrilateral.getPerimetr());
        System.out.println(stringBuilder);


    }
}
