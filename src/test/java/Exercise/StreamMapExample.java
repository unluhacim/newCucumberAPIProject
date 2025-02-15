package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Convert all names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}
