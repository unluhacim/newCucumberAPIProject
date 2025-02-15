package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<Product> products = List.of(          //Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Headphones", 150)
        );

        // Filtering products with price > 500
        List<Product> selectedProducts = products.stream()
                .filter(product -> product.name.length() > 5)
                .collect(Collectors.toList());

        selectedProducts.forEach(System.out::println);


}


}

