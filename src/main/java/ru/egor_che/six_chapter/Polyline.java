package ru.egor_che.six_chapter;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    List<Line> lineList;//объявление
    //конструктор
    public Polyline(List<Line> lineList) {
        this.lineList = lineList;
    }
    //2 конструктор
    public static Polyline buildPolyline(List<Point> pointList) {
        List<Line> lineList = new ArrayList<>();
        for (int i = 1; i < pointList.size(); i++) {
            lineList.add(new Line(pointList.get(i-1),pointList.get(i)));
        }
        return new Polyline(lineList);
    }
    public double getBrokenLineLenght(){
        double lenght = 0.;
        for (int i = 0; i < lineList.size(); i++) {
            lenght += lineList.get(i).getLineLenght();
        }
        return lenght;
    }
    @Override
    public String toString(){
        String brokenLine = "";
        for (int i = 0; i < lineList.size(); i++) {
            brokenLine += lineList.get(i).toString()+"\n";
        }
        return brokenLine;
    }
}
