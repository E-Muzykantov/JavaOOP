package Gb.Lesson5.HomeWork.Model;

public class PhoneBook {
    String name;
    String surname;
    Integer phoneNumber;
    String comment;
    Type type;

    public PhoneBook(String name, String surname, Integer phoneNumber, String comment, Type type) {

        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", comment='" + comment + '\'' +
                '}';
    }
}
