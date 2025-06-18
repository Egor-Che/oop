package ru.egor_che.nine_chapter;

class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return 31 * start.hashCode() + end.hashCode();
    }

    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.start = this.start.clone(); // Глубокое копирование точки start
            cloned.end = this.end.clone();     // Глубокое копирование точки end
            return cloned;
        } catch (CloneNotSupportedException e) {
            // Это не должно произойти, так как мы реализуем Cloneable
            throw new AssertionError();
        }
    }
}
