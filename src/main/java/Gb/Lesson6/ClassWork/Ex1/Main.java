package Gb.Lesson6.ClassWork.Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BookGenre bookGenre = new BookGenre("комедия");
        BookGenre bookGenre2 = new BookGenre("комедия");

        Book book1 = new Book("qwe","asd",1995, bookGenre);
        Book book2 = new Book("qwe2","asd",2000,bookGenre);
        Book book3 = new Book("qwe3","asd3",2008,bookGenre2);

        Lib liblib = new Lib(Arrays.asList(
                new Book("qwe","asd",1995, new BookGenre("комедия")),
                new Book("qwe2","asd",2000,new BookGenre("комедия")),
                new Book("qwe3","asd3",2008,new BookGenre("комедия"))));

        System.out.println("liblib.searchAutor(\"asd\") = " + liblib.searchAutor("asd"));
        System.out.println("liblib.searchAutor(\"as3\") = " + liblib.searchAutor("as3"));

        Formatter formatter = new JsonFormatter();
        formatter.formatted(liblib.getBooks());


    }
}
