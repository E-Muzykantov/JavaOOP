package Gb.Lesson5.ClassWork.Ex1;

public class Example {
    public static void main(String[] args) {
        // Локальный класс
        class Point{
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }
        Point point = new Point(3);
        System.out.println("point = " + point);
    }
}
