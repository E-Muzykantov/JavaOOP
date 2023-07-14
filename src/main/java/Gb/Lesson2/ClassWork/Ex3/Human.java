package Gb.Lesson2.ClassWork.Ex3;

public class Human {

    private Transport currentTransport;

    public void drive(Transport transport) {
        currentTransport = transport;
        transport.start();
    }

    public void stop() {
        if (currentTransport != null) {
            currentTransport.stop();
            currentTransport = null;
        } else {
            System.out.println("не едем!");
        }
    }
}
