package Gb.Lesson6.ClassWork.Ex1;

public class ElectronBook extends Book{
    private String format;
    private Integer size;


    public ElectronBook(String name, String autor, int age, BookGenre bookGenre, String format, Integer size) {
        super(name, autor, age, bookGenre);
        this.format = format;
        this.size = size;
    }

    public ElectronBook(String format, Integer size) {
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
