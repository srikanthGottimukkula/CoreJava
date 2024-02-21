package java8features;

import java.util.*;

public class Map_ReduseDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 4, 6, 3, 1);

        List<String> words = Arrays.asList("srikanth", "abhiram", "srikrishna", "sriRama");

        //nomral way to add average
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);

        //stream 8 features using reduce and map method

        int mapSum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(mapSum1);

        int reduseSum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduseSum2);

        Optional<Integer> methodRefSum = numbers.stream().reduce(Integer::sum);
        System.out.println(methodRefSum);

        int reduseMuply3 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduseMuply3);

        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        Integer maxValueRef = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueRef);

        String longestWord = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestWord);

        //realTime Example




    }
}
