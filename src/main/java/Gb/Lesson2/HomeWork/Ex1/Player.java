package Gb.Lesson2.HomeWork.Ex1;

public interface Player {

    void jump(Wall wall);
    void run(Treadmill treadmill);
    boolean isJump(Wall wall);
    boolean isRun(Treadmill treadmill);
    void getInfo();
}
