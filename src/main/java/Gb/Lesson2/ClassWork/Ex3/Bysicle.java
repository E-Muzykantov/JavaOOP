package Gb.Lesson2.ClassWork.Ex3;

public class Bysicle implements Transport {
    @Override
    public void start() {
        System.out.println("b-cle run");
    }

    public void stop() {
        System.out.println("вел остановился");
    }

}