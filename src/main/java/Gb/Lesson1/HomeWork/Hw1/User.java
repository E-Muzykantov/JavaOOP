package Gb.Lesson1.HomeWork.Hw1;

public class User {
    private String login;
    private Integer password;
    private Basket basket;

    public User(String login, Integer password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }


    public void printBasket(){
        System.out.println(login + " Bought:");
        for (Product product: basket.getProducts()) {
            System.out.println(product.getName() + " - Price: " + product.getPrice() + " Rating: " + product.getRating());
        }
        System.out.println("");
    }
}
