package six_chapter;

import java.util.Objects;

public class Point {
    //поля класса
    private int x; // абсцисса точки
    private int y; // ордината точки
    // конструктор, создающий точку с указанными координатами
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
//Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setAll(int x, int y) {
        this.x = x;
        this.y = y;
    }

//переопределение эквивалентов и хеша
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    // возвращает строку с описанием точки
    @Override
    public String toString() {
        return String.format("{%s;%s}", x, y);
    }
}