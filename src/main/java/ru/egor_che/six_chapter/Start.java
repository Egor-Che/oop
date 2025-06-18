package ru.egor_che.six_chapter;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        //Задание 1 - точка координат, сравнение точек
        Point p1 = new Point(1,3);//точка 1
        Point p2 = new Point(1,3);//точка 2
        Point p3 = new Point(5,8);//точка 3
        Point p4 = new Point(10,11);//точка 2
        Point p5 = new Point(15,19);//точка 3
        //polyline
        Point p6 = new Point(1,5);
        Point p7 = new Point(2,8);
        Point p8 = new Point(5,3);
        Point p9 = new Point(8,9);

        //Вывод точек - задание 1
        System.out.println("Точки: "); //Задание на вывод и равнение точек
        System.out.print(p1 + " ");
        System.out.print(p1.equals(p3));//сравнение первой и третьей
        System.out.println(" " + p3 + " - сравнение 1 и 3 точек");

        System.out.print(p2 + " ");
        System.out.print(p2.equals(p3));//сравнение второй и третьей
        System.out.println(" " + p3 + " - сравнение 2 и 3 точек");

        System.out.print(p1 + " ");
        System.out.print(p1.equals(p2));//сравнение первой и второй
        System.out.println(" " + p2 + " - сравнение 1 и 2 точек");

        System.out.println(" "); //Переход от задания точки к заданию линии
        System.out.println("Линии: "); //Переход от задания точки к заданию линии

        Line line1 = new Line(p1,p3);
        System.out.println(line1);
        Line line2 = new Line(p4,p5);
        System.out.println(line2);
        Line line3 = new Line(p3,p4);
        System.out.println(line3);
        //меняем координаты начала и конца 3 линии
        p3.setAll(4,22);
        p4.setAll(14,5);

        System.out.println("Вывод с изменными координатами: "); //Переход от задания точки к заданию линии
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line1.getLineLenght() + line2.getLineLenght() + line3.getLineLenght());

        System.out.println("Ломаная линия: "); //Переход к ломаной
        List<Point> pointList = List.of(p6,p7,p8,p9);
        Polyline polyline1 = Polyline.buildPolyline(pointList);
        System.out.println(polyline1.toString());
        System.out.println(polyline1.getBrokenLineLenght());

        //массив отрезков ломаной + сравнение длин с ломаной
        Line line4 = new Line(p6,p7);
        System.out.println(line4);
        Line line5 = new Line(p7,p8);
        System.out.println(line5);
        Line line6 = new Line(p8,p9);
        System.out.println(line6);
        System.out.println(line4.getLineLenght() + line5.getLineLenght() + line6.getLineLenght());

        //изменение точки, вывод обновленных линий
        p7.setX(12);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line4.getLineLenght() + line5.getLineLenght() + line6.getLineLenght());
        System.out.println(polyline1.getBrokenLineLenght());

        System.out.println(" "); //
        System.out.println("Города: "); //Переход к городам

        String cityName1 = String.valueOf(CityName.getCityName());
        String cityName2 = String.valueOf(CityName.setCityName("Moscow"));
        System.out.println(cityName1);
        System.out.println(cityName2);
    }
}
