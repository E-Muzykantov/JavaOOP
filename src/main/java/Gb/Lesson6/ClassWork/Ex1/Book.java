package Gb.Lesson6.ClassWork.Ex1;

public class Book {
    private String name;
    private String autor;
    private int age;
    private BookGenre bookGenre;

    public Book(String name, String autor, int age, BookGenre bookGenre) {
        this.name = name;
        this.autor = autor;
        this.age = age;
        this.bookGenre = bookGenre;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Имя книги = '" + name + '\'' +
                ", автор='" + autor + '\'' +
                ", age=" + age +
                ", жанр=" + bookGenre +
                '}';
    }
}
