package six_chapter;

public class Start {
    public static void main(String[] args) {
        //Задание 1 - точка координат, сравнение точек
        Point p1 = new Point(1,3);//точка 1
        Point p2 = new Point(1,3);//точка 2
        Point p3 = new Point(5,8);//точка 3

        System.out.print(p1 + " ");
        System.out.print(((p1.x) == (p3.x)) && ((p1.y) == (p3.y)));//сравнение первой и третьей
        System.out.println(" " + p3);

        System.out.print(p2 + " ");
        System.out.print(((p2.x) == (p3.x)) && ((p2.y) == (p3.y)));//сравнение второй и третьей
        System.out.println(" " + p3);

        System.out.print(p1 + " ");
        System.out.print(((p1.x) == (p2.x)) && ((p1.y) == (p2.y)));//сравнение первой и второй
        System.out.println(" " + p2);

        Line line = new Line(p1, p3);
        System.out.println(line.toString());
    }
}