package ru.egor_che.eight_chapter;

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y); // Вызов конструктора родительского класса
        this.z = z;
    }
}
