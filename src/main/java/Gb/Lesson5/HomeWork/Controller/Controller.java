package Gb.Lesson5.HomeWork.Controller;

import Gb.Lesson5.HomeWork.Model.PhoneBook;
import Gb.Lesson5.HomeWork.Model.Type;
import Gb.Lesson5.HomeWork.Service.PhoneBookService;
import Gb.Lesson5.HomeWork.Service.PhoneNumber;
import Gb.Lesson5.HomeWork.View.View;

import java.util.List;

public class Controller {
    private PhoneBookService phoneBookService = new PhoneBookService();
    private PhoneNumber phoneNumberCreate = new PhoneNumber();
    private View view = new View();

    public void addContact(String name, String surname, Integer phoneNumber, String comment) {
        phoneNumberCreate.create(name, surname, phoneNumber, comment);
    }

    public void getAllContacts() {
        List<PhoneBook> phoneBookList = phoneBookService.read();
        for (PhoneBook phoneBook : phoneBookList) {
            view.printConsole(phoneBook);
        }
    }

    public void changeFormat(Type type) {
        phoneBookService.changeFormat(type);
    }

    public void getFormat() {
        System.out.println("phoneBookService.getFormat() = " + phoneBookService.getFormat());
    }
}

