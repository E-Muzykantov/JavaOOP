package Gb.Lesson5.ClassWork.Ex2.service;

import Gb.Lesson5.ClassWork.Ex2.modell.Type;
import Gb.Lesson5.ClassWork.Ex2.modell.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();
}