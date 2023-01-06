package exercises.polyline;

public class Main {

    public static void main(String[] args) {
        Polyline polyline = new Polyline();
        polyline.addPoint(new Point(1, 2));
        polyline.addPoint(new Point(3, 4));
        polyline.addPoint(new Point(1, 2)); // prints "Point already exists"
        polyline.addPoint(new Point(3, 4)); // prints "Start point is equal to end point"
        polyline.addPoint(1, 2);
        System.out.println(polyline);
    }
}
