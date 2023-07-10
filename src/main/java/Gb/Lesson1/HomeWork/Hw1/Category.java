package Gb.Lesson1.HomeWork.Hw1;

import java.util.ArrayList;
import java.util.List;


public class Category {
    private String name;
    public List<Product> productList;


    public Category(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
