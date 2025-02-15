package Exercise;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()               // Source
                .filter(name -> name.length() > 3) // Intermediate
                .forEach(System.out::println); // Terminal
    }


}
