package ru.egor_che.eight_chapter;
class PolyLine implements Measurable {
    public Point[] points;

    public PolyLine(Point... points) {
        if (points.length < 3) {
            throw new IllegalArgumentException("Ломаная линия должна иметь не менее 3 точек");
        }
        this.points = points;
    }

    // Реализация метода интерфейса Measurable
    @Override
    public double getLength() {
        return length();
    }

    public double length() {
        double totalLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            totalLength += distanceBetween(points[i], points[i + 1]);
        }
        return totalLength;
    }

    private double distanceBetween(Point a, Point b) {
        int dx = b.x - a.x;
        int dy = b.y - a.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void draw() {
        System.out.println("Ломаная линия из " + points.length + " точек:");
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i]);
            if (i < points.length - 1) {
                System.out.print(" → ");
            }
        }
        System.out.println("\nОбщая длина: " + length());
    }
}
