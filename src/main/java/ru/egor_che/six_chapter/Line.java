package ru.egor_che.six_chapter;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1), new Point(x2,y2));
    }
    public Line(Point startPoint, Point endPoint) {
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
    //рассчет длины линии
    public double getLineLenght(){
        return Math.sqrt(Math.pow(startPoint.getX() - endPoint.getX(), 2) + (Math.pow(startPoint.getY() - endPoint.getY(), 2)));
    }
    @Override
    public String toString(){
        return "Line: [StartPoint (" + getStartPoint() + ") "+", EndPoint (" + getEndPoint() + ")]";
    }
}