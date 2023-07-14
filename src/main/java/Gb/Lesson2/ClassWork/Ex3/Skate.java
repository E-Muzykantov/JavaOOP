package Gb.Lesson2.ClassWork.Ex3;

public class Skate implements Transport {
    @Override
    public void start() {
        System.out.println(" skate run");
    }

    public void stop() {
        System.out.println("скейт остановился");
    }
}