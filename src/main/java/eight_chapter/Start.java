package eight_chapter;
public class Start {
    // Метод для обработки набора измеряемых объектов
    public static void printLengths(Measurable... measurables) {
        for (Measurable m : measurables) {
            System.out.println("Длина: " + m.getLength());
        }
    }
    public static void main(String[] args) {
        System.out.println("Точка с тремя координатами:");
        //Point3D
        Point3D point = new Point3D(2, 4, 6);
        System.out.println("X: " + point.x + ", Y: " + point.y + ", Z: " + point.z);

        //ClosedPolyLine
        // Создаем точки для ломаных линий
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 1);
        Point p4 = new Point(4, 3);

        System.out.println("Обычная ломаная линия:");
        PolyLine line = new PolyLine(p1, p2, p3, p4);
        line.draw();

        System.out.println("\nЗамкнутая ломаная линия:");
        ClosedPolyLine closedLine = new ClosedPolyLine(p1, p2, p3, p4);
        closedLine.draw();

        System.out.println("\nВывод длин обеих ломаных через интерфейс:");
        // Вызываем метод с обоими типами линий
        printLengths(line, closedLine);
    }
}
