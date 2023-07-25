package Gb.Lesson5.HomeWork.Service;

import Gb.Lesson5.HomeWork.Model.PhoneBook;
import Gb.Lesson5.HomeWork.Model.Type;

import java.util.List;

public interface DataService {
    List<PhoneBook> read();
    Type getFormat();
    void changeFormat(Type type);
}
