package Gb.Lesson2.HomeWork.Ex1;

public class Human implements Player{
    private String name;
    private Integer maxJump;
    private Integer maxRun;

    public Human(String name, Integer maxJump, Integer maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }


    @Override
    public void jump(Wall wall) {
        if (maxJump >= wall.getHeight()){
            System.out.println("Человек по имени " + name + " перепрыгнул стену высотой " +
                    wall.getHeight() + " метров");
        }
        else {
            System.out.println("Человек по имени " + name + " не перепрыгнул стену высотой " +
                    wall.getHeight() + " метров и выбывает");
        }
    }


    public void run(Treadmill treadmill) {
        if (maxRun >= treadmill.getLength()){
            System.out.println("Человек по имени " + name + " пробежал растояние " +
                    treadmill.getLength() + " метров.");

        }
        else {
            System.out.println("Человек по имени " + name + " не пробежал растояние " +
                    treadmill.getLength() + " метров и выбывает.");
        }
    }

    @Override
    public boolean isJump(Wall wall) {
        if (maxJump >= wall.getHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isRun(Treadmill treadmill) {
        if (maxRun >= treadmill.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public void getInfo() {
        System.out.println("Человек по имени " + name + " может прыгать на высоту " +
                maxJump + " и бегает на растояние " + maxRun + " метров.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(Integer maxJump) {
        this.maxJump = maxJump;
    }

    public Integer getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(Integer maxRun) {
        this.maxRun = maxRun;
    }
}
