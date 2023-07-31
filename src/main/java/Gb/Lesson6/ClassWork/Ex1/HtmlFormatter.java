package Gb.Lesson6.ClassWork.Ex1;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " была переведена в формат: "
                    + Format.HTML);
        }
    }
}
