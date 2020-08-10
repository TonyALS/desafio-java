package exercise2.Models;

import java.util.function.Function;

public class Product {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public static Function<Product, Double> getPriceProduct = product -> product.price;
}
