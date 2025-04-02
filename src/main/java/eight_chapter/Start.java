package eight_chapter;

public class Start {
    public static void main(String[] args) {
        System.out.println("Точка с тремя координатами:");
        //Point3D
        Point3D point = new Point3D(2, 4, 6);
        System.out.println("X: " + point.x + ", Y: " + point.y + ", Z: " + point.z);

        //ClosedPolyLine
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 0);
        Point p4 = new Point(4, 2);

        System.out.println("Обычная ломаная линия:");
        PolyLine line = new PolyLine(p1, p2, p3, p4);
        line.draw();

        System.out.println("\nЗамкнутая ломаная линия:");
        ClosedPolyLine closedLine = new ClosedPolyLine(p1, p2, p3, p4);
        closedLine.draw();
    }
}
