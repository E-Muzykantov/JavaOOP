package Gb.Lesson5.ClassWork.Ex2.controller;

import Gb.Lesson5.ClassWork.Ex2.modell.Student;
import Gb.Lesson5.ClassWork.Ex2.modell.Type;
import Gb.Lesson5.ClassWork.Ex2.modell.User;
import Gb.Lesson5.ClassWork.Ex2.service.UserService;
import Gb.Lesson5.ClassWork.Ex2.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
