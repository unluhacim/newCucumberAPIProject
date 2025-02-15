package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

