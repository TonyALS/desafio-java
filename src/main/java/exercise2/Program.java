package exercise2;

import exercise2.Models.Product;
import exercise2.Utils.Operations;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setPrice(10);

        Product p2 = new Product();
        p2.setPrice(29.75);

        List<Product> products = Arrays.asList(p1, p2);

        Double value = products.stream()
                .map(Product.getPriceProduct)
                .reduce(Operations.sum).get();
        System.out.println(value);
    }
}

