package Gb.Lesson5.HomeWork;

import Gb.Lesson5.HomeWork.Controller.Controller;
import Gb.Lesson5.HomeWork.Model.Type;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addContact("Egor", "Popov", 123456, "Job");
        controller.addContact("Alex", "Sumov", 654321, "Friend");
        controller.addContact("Home", "", 1112223, "Home");
        controller.addContact("Evgen", "Abramov", 7777755, "Delivery");
        controller.getAllContacts();
        controller.getFormat();
        controller.changeFormat(Type.HTML);
        controller.getFormat();
    }
}

