package six_chapter;

public class Point {
    //поля класса
    public int x; // абсцисса точки
    public int y; // ордината точки

    // конструктор, создающий точку с указанными координатами
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    // возвращает строку с описанием точки
    public String toString() {
        return String.format("{%s;%s}", x, y);
    }
}