package Gb.Lesson5.ClassWork.Ex1;

public class Fly {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        System.out.println(flyable.getClass().getName());
        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        System.out.println(flyable2.getClass().getName());

    }
}
