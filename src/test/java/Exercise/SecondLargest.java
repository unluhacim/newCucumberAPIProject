package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.apache.poi.sl.draw.geom.GuideIf.Op.max;

public class SecondLargest {

    public static void main(String[] args) {
        Integer[] numbers = {100, 20, 5, 8, 95, 100, 30}; // Example array

        List<Integer> list = Arrays.asList(numbers);

        // Find max value first
        Integer max = list.stream().max(Integer::compareTo).orElseThrow();

        // Find second largest number
        Integer secondLargest = list.stream()
                .filter(num -> num < max)  // Exclude the max value
                .max(Integer::compareTo)   // Get the max among the remaining numbers
                .orElseThrow();

        System.out.println("Second Largest: " + secondLargest);


//        2nd way:
//        Optional<Integer> secondLargest = Arrays.stream(numbers)  // Convert array to stream
//                .distinct()             // Remove duplicates
//                .boxed()                // Convert int to Integer as sorted needs an object
//                .sorted((a, b) -> b - a) // Sort in descending order
//                .skip(1)              // Skip the first (largest) element
//                .findFirst();            // Get the second element
//
//        // Print the result
//        secondLargest.ifPresentOrElse(
//                num -> System.out.println("Second Largest Number: " + num),
//                () -> System.out.println("No second largest number found")
//        );



    }



}
