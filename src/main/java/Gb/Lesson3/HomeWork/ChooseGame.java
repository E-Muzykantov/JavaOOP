package Gb.Lesson3.HomeWork;

import java.util.Scanner;

public class ChooseGame {
    Log log;

    void gameMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в быки и коровы! \nВыберите соответствующую цифру:\n" +
                "1 - Новая игры\n" +
                "2 - Выход\n");
        int value = scan.nextInt();
        switch (value) {
            case 1:
                chooseGame();
                break;
            case 2:
                break;
        }
    }

    void chooseGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите игру:\n" +
                "1 - Игра с цифрами\n" +
                "2 - Игра с алфавитом [RU] \n" +
                "3 - Игра с алфавитом [EN]\n");
        int value = scan.nextInt();
        switch (value) {
            case 1:
                System.out.println("Отлично! Давай сыграем.");
                NumberGame numberGame = new NumberGame();
                numberGame.startGame();
                break;
            case 2:
                System.out.println("Отлично! Давай сыграем.");
                RuGame ruGame = new RuGame();
                ruGame.startGame();
                break;
            case 3:
                System.out.println("Отлично! Давай сыграем.");
                EnGame engGame = new EnGame();
                engGame.startGame();
                break;
        }
    }

}
