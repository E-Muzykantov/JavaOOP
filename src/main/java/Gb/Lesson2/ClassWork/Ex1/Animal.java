package Gb.Lesson2.ClassWork.Ex1;

public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public abstract void klubok();
    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalInfo();

    public void voice() {
        System.out.println("Звук!");
    }

    public void jump() {
        System.out.println(" Прыжок ! ");
    }
}
