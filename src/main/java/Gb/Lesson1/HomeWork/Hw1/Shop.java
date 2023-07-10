package Gb.Lesson1.HomeWork.Hw1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> shop;


    public Shop() {
        shop = new ArrayList<>();
    }

    public List<Category> getShop() {
        return shop;
    }

    public void setShop(List<Category> shop) {
        this.shop = shop;
    }

    public void add(Category category){
        shop.add(category);
    }

    public void printShop() {
        for (Category category : shop) {
            System.out.println(category.getName());
            for (Product product : category.getProductList()) {
                System.out.println(product.getName() + " - Price: " + product.getPrice()
                                    + " Raintg: " + product.getRating());
            }
            System.out.println("");
        }

    }
}