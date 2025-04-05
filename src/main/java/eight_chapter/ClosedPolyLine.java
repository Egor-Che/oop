package eight_chapter;
class ClosedPolyLine extends PolyLine implements Start.Measurable {
    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double getLength() {
        return length();
    }

    @Override
    public double length() {
        double baseLength = super.length();
        Point first = points[0];
        Point last = points[points.length - 1];
        double dx = last.x - first.x;
        double dy = last.y - first.y;
        double closingLength = Math.sqrt(dx * dx + dy * dy);
        return baseLength + closingLength;
    }
}

