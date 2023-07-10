package Gb.Lesson1.HomeWork.Hw1;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Product> products;



    public Basket(List<Product> products) {
        this.products = products;
    }

    public Basket() {

        products = new ArrayList<>();
    }

    public void addBasket(Product product, Category category) {
       products.add(product);
       category.getProductList().remove(product);
    }

    public void deleteBasket(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
