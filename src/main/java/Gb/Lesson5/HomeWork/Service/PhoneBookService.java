package Gb.Lesson5.HomeWork.Service;

import Gb.Lesson5.HomeWork.Model.PhoneBook;
import Gb.Lesson5.HomeWork.Model.Type;

import java.util.List;

public class PhoneBookService implements DataService {
    PhoneNumber phoneNumber = new PhoneNumber();

    @Override
    public List<PhoneBook> read() {
        return phoneNumber.getPhoneBookList();
    }

    @Override
    public Type getFormat() {
        if (!phoneNumber.getPhoneBookList().isEmpty()) {
            return phoneNumber.getPhoneBookList().get(0).getType();
        } else return Type.TXT;
    }

    @Override
    public void changeFormat(Type type) {
        for (PhoneBook phoneBook : phoneNumber.getPhoneBookList()) {
            phoneBook.setType(type);
        }
    }
}
