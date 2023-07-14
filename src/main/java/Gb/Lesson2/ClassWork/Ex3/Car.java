package Gb.Lesson2.ClassWork.Ex3;

public class Car implements Transport{
    public void run() {
        System.out.println("Машина едет");
    }

    @Override
    public void start() {

    }

    public void stop() {
        System.out.println("Машина остановилсась");
    }
}
