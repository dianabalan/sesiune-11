package exercises.polyline;

import java.util.Arrays;

class Polyline {

    private Point[] points;
    private int size;

    public Polyline() {
        this.points = new Point[10];
        this.size = 0;
    }

    public void addPoint(Point point) {
        if (size > 0 && points[size - 1].equals(point)) {
            System.out.println("Start point is equal to end point");
            return;
        }

        for (int i = 0; i < size; i++) {
            if (points[i].equals(point)) {
                System.out.println("Point already exists");
                return;
            }
        }

        points[size++] = point;
    }

    public void addPoint(int x, int y) {
        addPoint(new Point(x, y));
    }

    @Override
    public String toString() {
        return "Polyline: " + Arrays.toString(Arrays.copyOfRange(points, 0, size - 1));
    }
}