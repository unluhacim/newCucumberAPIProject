package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("john@example.com", "alice@example.com", "bob@example.com", "aliceHr@gmail.com");

        // Print each email
                List<String> list=emails.stream()
                .filter(email->email.contains("example"))
                .sorted()
                .collect(Collectors.toList());

                list.forEach(System.out::println);
    }

}
