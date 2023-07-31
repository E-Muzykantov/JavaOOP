package Gb.Lesson6.ClassWork.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Lib implements Searchable{
    List<Book> books;

    public Lib(List<Book> books) {
        this.books = books;
    }

    public Lib() {
    }

    @Override
    public List<Book> searchAutor(String autorName) {
        List<Book> resBook = new ArrayList<>();
        for (Book book : books) {
            if (book.getAutor().equals(autorName)){
                resBook.add(book);
            }
        }
        return resBook;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
