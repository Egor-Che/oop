package six_chapter;
public class Polyline {
    private Point startPoint;
    private Point endPoint;

    public Polyline(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    //Getters
    public Point getStartPoint(){
        return this.startPoint;
    }
    public Point getEndPoint(){
        return this.endPoint;
    }
    //Setters
    public void setStartPoint(Point startPoint){
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint){
        this.endPoint = endPoint;
    }
    public String toString(){
        return "Line: [StartPoint (" + getStartPoint() + ") " + ", EndPoint (" + getEndPoint() + ")]";
    }
}
/*
Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
Рассчитать длину Ломаной
Получить у Ломаной массив Линий
Рассчитать длину массива Линий
Сравнить длину Ломаной и массива Линий: они должны совпасть
Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
 */