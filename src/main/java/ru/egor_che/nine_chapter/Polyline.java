package ru.egor_che.nine_chapter;

class PolyLine implements Cloneable {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLine polyLine = (PolyLine) obj;
        if (points.length != polyLine.points.length) return false;
        for (int i = 0; i < points.length; i++) {
            if (!points[i].equals(polyLine.points[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (Point point : points) {
            result = 31 * result + point.hashCode();
        }
        return result;
    }

    @Override
    public PolyLine clone() {
        try {
            PolyLine cloned = (PolyLine) super.clone();
            cloned.points = new Point[this.points.length];
            for (int i = 0; i < this.points.length; i++) {
                cloned.points[i] = this.points[i].clone();
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public double length() {
        double sum = 0;
        for (int i = 1; i < points.length; i++) {
            double dx = points[i].x - points[i-1].x;
            double dy = points[i].y - points[i-1].y;
            sum += Math.sqrt(dx*dx + dy*dy);
        }
        return sum;
    }
}
