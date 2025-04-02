package eight_chapter;
class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points); // Передаем точки в конструктор родительского класса
    }

    @Override
    public double length() {
        // Сначала получаем длину незамкнутой линии через родительский метод
        double baseLength = super.length();

        // Добавляем расстояние между последней и первой точкой
        Point first = points[0];
        Point last = points[points.length - 1];
        double dx = last.x - first.x;
        double dy = last.y - first.y;
        double closingLength = Math.sqrt(dx * dx + dy * dy);

        return baseLength + closingLength;
    }
}
