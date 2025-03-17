package six_chapter;

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
        System.out.print(((p1.x) == (p3.x)) && ((p1.y) == (p3.y)));//сравнение первой и третьей
        System.out.println(" " + p3 + " - сравнение 1 и 3 точек");

        System.out.print(p2 + " ");
        System.out.print(((p2.x) == (p3.x)) && ((p2.y) == (p3.y)));//сравнение второй и третьей
        System.out.println(" " + p3 + " - сравнение 2 и 3 точек");

        System.out.print(p1 + " ");
        System.out.print(((p1.x) == (p2.x)) && ((p1.y) == (p2.y)));//сравнение первой и второй
        System.out.println(" " + p2 + " - сравнение 1 и 2 точек");

        System.out.println(" "); //Переход от задания точки к заданию линии
        System.out.println("Линии: "); //Переход от задания точки к заданию линии

        //вывод линий - задание 2
        Line line1 = new Line(p1, p3);
        System.out.println(line1.toString());
        Line line2 = new Line(p4, p5);
        System.out.println(line2.toString());
        Line line3 = new Line(p3, p4);
        System.out.println(line3.toString() + " - Начальные координаты линии 3");

        System.out.println("Изменение координат начала и конца линии 3");
        p3 = new Point(9,12);
        p4 = new Point(13,16);
        line1 = new Line(p1, p3);
        System.out.println(line1.toString());
        line2 = new Line(p4, p5);
        System.out.println(line2.toString());
        line3 = new Line(p3, p4);
        System.out.println(line3.toString() + " - Новые координаты линии 3");
        double dis1=Math.sqrt((p1.x-p3.x)*(p1.x-p3.x) + (p1.y-p3.y)*(p1.y-p3.y));
        double dis2=Math.sqrt((p4.x-p5.x)*(p4.x-p5.x) + (p4.y-p5.y)*(p4.y-p5.y));
        double dis3=Math.sqrt((p3.x-p4.x)*(p3.x-p4.x) + (p3.y-p4.y)*(p3.y-p4.y));
        double dis = dis1 + dis2 + dis3;
        System.out.println("Общая длина трех отрезков равна: " + dis);

        //вывод ломаной линии - задание 3
        System.out.println(" "); //Переход от задания линии к заданию ломаная линия
        System.out.println("Ломаная линия:");
        Polyline polyline = new Polyline(p6, p7);
        System.out.println(polyline.toString());
        Polyline polyline2 = new Polyline(p7, p8);
        System.out.println(polyline2.toString());
        Polyline polyline3 = new Polyline(p8, p9);
        System.out.println(polyline3.toString());
        double dis4=Math.sqrt((p6.x-p7.x)*(p6.x-p7.x) + (p6.y-p7.y)*(p6.y-p7.y));
        double dis5=Math.sqrt((p7.x-p8.x)*(p7.x-p8.x) + (p7.y-p8.y)*(p7.y-p8.y));
        double dis6=Math.sqrt((p8.x-p9.x)*(p8.x-p9.x) + (p8.y-p9.y)*(p8.y-p9.y));
        double disPolyline = dis4 + dis5 + dis6;
        System.out.println("Общая длина трех отрезков равна: " + disPolyline);
    }
}