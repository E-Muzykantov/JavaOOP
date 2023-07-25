package Gb.Lesson5.HomeWork.Service;

import Gb.Lesson5.HomeWork.Model.PhoneBook;
import Gb.Lesson5.HomeWork.Model.Type;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber implements PhoneNumberCreate {
    List<PhoneBook> phoneBookList = new ArrayList<>();

    @Override
    public void create(String name, String surname, Integer phoneNumber, String comment) {
        phoneBookList.add(new PhoneBook(name, surname, phoneNumber, comment, Type.TXT));
    }

    public List<PhoneBook> getPhoneBookList() {
        return phoneBookList;
    }
}