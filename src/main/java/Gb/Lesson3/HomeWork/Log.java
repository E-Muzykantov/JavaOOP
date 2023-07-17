package Gb.Lesson3.HomeWork;

import java.util.Date;

public class Log {
    private Date date ;
    private String value;
    private Answer answer;


    public Log(Date date, String value, Answer answer) {
        this.date = date;
        this.value = value;
        this.answer = answer;
    }
    public Log() {
    }

    @Override
    public String toString() {
        return  "Дата и время: " + date +
                ", Введение данные: " + value +
                ", Ответ: " + answer;
    }
}
