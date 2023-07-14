package Gb.Lesson2.HomeWork.Ex1;

public class Obstacles {
    private Treadmill treadmill;
    private Wall wall;

    public Obstacles(Treadmill treadmill, Wall wall) {
        this.treadmill = treadmill;
        this.wall = wall;
    }

    public Treadmill getTreadmill() {
        return treadmill;
    }

    public void setTreadmill(Treadmill treadmill) {
        this.treadmill = treadmill;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
