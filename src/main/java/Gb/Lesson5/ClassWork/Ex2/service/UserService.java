package Gb.Lesson5.ClassWork.Ex2.service;


import Gb.Lesson5.ClassWork.Ex2.modell.Student;
import Gb.Lesson5.ClassWork.Ex2.modell.Teacher;
import Gb.Lesson5.ClassWork.Ex2.modell.Type;
import Gb.Lesson5.ClassWork.Ex2.modell.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, patron, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, patron, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
                    for (User user : userList) {
                if (user instanceof Teacher && !isStudent) {
                    lastId++;
                }
                if (user instanceof Student && isStudent) {
                    lastId++;
                }
            }
            return ++lastId;

    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }
}
