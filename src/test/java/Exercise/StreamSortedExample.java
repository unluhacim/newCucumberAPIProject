package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 85),
                new Student("John", 92),
                new Student("Bob", 78)
        ));

        // Sort students by grade in descending order
        students.stream()
                .sorted(Comparator.comparingInt(s -> -s.grade))
                .forEach(System.out::println);
    }
}
