package six_chapter;

public class Start {
    public static void main(String[] args) {
        //Задание 1 - точка координат, сравнение точек
        Point p1 = new Point(1,3);//точка 1
        Point p2 = new Point(1,3);//точка 2
        Point p3 = new Point(5,8);//точка 3
        Point p4 = new Point(10,11);//точка 2
        Point p5 = new Point(15,19);//точка 3

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
    }
}