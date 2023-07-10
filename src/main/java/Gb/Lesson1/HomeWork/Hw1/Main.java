package Gb.Lesson1.HomeWork.Hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList1 = new ArrayList<>();
        productList1.add(new Product("Apple", 35, 5.0));
        productList1.add(new Product("Orange", 45, 4.7));
        productList1.add(new Product("Pineapple", 35, 4.6));
        List<Product> productList2 = new ArrayList<>();
        productList2.add(new Product("TV", 1000, 4.9));
        productList2.add(new Product("Laptop", 2500, 4.8));
        productList2.add(new Product("PC", 3700, 4.5));
        Category category1 = new Category("Fruits",productList1);
        Category category2 = new Category("Technic",productList2);
//
        Shop shop = new Shop();
        shop.add(category1);
        shop.add(category2);
        System.out.println("Добро пожаловать в наш магазин, взгляните на товары.\n");
        shop.printShop();


        User user1 = new User("Egor",12345);
        User user2 = new User("Dima",123);

        user1.getBasket().addBasket(category1.getProductList().get(0), category1);
        user1.getBasket().addBasket(category1.getProductList().get(1), category1);
        user2.getBasket().addBasket(category2.getProductList().get(1), category2);
        user2.getBasket().addBasket(category2.getProductList().get(0), category2);
        user1.printBasket();
        user2.printBasket();
        shop.printShop();
    }
}