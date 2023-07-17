package Gb.Lesson3.HomeWork;

import java.util.*;

public class NumberGame extends AbstractGame {
    private NumberGame numberGame;

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(String.valueOf(i));

        }
        return result;
    }

    void startGame() {
        NumberGame numberGame = new NumberGame();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну слова: ");
        int sizeWord = scan.nextInt();
        System.out.println("Введите количество попыток: ");
        int tries = scan.nextInt();
        scan.nextLine();
        numberGame.start(sizeWord, tries);
        List<Log> logList = new ArrayList<>();
        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
            System.out.println("Попробуй угадать: ");
            String value = scan.nextLine();
            Answer answer = numberGame.inputValue(value);
            logList.add(new Log(new Date(), value, answer));
            if (answer != null) {
                System.out.println(answer);
            }
        }
        System.out.println("\nХотите посмотреть логи игры?\n" +
                "1 - Да\n" +
                "2 - Нет");
        int value = scan.nextInt();
        switch (value) {
            case 1:
                System.out.println("Логи Игры\n");
                for (Log log : logList) {
                    System.out.println(Arrays.asList(log));
                }
                break;
            case 2:
                break;
        }
    }
}

