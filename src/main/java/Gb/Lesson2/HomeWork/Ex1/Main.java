package Gb.Lesson2.HomeWork.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstacles> obstaclesList = new ArrayList<>();
        obstaclesList.add(new Obstacles(new Treadmill(100), new Wall(1)));
        obstaclesList.add(new Obstacles(new Treadmill(200), new Wall(2)));
        obstaclesList.add(new Obstacles(new Treadmill(300), new Wall(3)));

        List<Player> playersList = new ArrayList<>();
        playersList.add(new Human("Egor", 1, 250));
        playersList.add(new Cat("Barsik", 2, 150));
        playersList.add(new Robot("T-1000", 5, 500));

        runObstacles(obstaclesList,playersList);

    }
    public static void runObstacles (List<Obstacles> obstaclesList,List<Player> playersList){
        List<Integer> exceptions = new ArrayList<>();
        for (int i = 0; i < obstaclesList.size(); i++) {
            for (int j = 0; j < playersList.size(); j++) {
                if (exceptions.contains(j)) {
                    continue;
                } else if (!playersList.get(j).isRun(obstaclesList.get(i).getTreadmill()) || !playersList.get(j).isJump(obstaclesList.get(i).getWall())) {
                    exceptions.add(j);
                }
                if (playersList.get(j).isRun(obstaclesList.get(i).getTreadmill())) {
                    playersList.get(j).run(obstaclesList.get(i).getTreadmill());
                    if (playersList.get(j).isJump(obstaclesList.get(i).getWall())) {
                        playersList.get(j).jump(obstaclesList.get(i).getWall());
                    }
                }
                if (!playersList.get(j).isRun(obstaclesList.get(i).getTreadmill())) {
                    playersList.get(j).run(obstaclesList.get(i).getTreadmill());
                }
                if (!playersList.get(j).isJump(obstaclesList.get(i).getWall())) {
                    playersList.get(j).jump(obstaclesList.get(i).getWall());
                }
            }
        }
    }
}