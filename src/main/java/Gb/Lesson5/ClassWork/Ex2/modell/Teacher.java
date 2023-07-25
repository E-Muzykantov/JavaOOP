package Gb.Lesson5.ClassWork.Ex2.modell;

public class Teacher extends User {
    int teacherId;


    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
