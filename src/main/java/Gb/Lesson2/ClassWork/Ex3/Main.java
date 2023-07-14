package Gb.Lesson2.ClassWork.Ex3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bysicle bysicle = new Bysicle();
        human.stop();
        human.drive(bysicle);
        human.stop();

    }
}