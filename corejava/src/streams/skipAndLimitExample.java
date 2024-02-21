package streams;

import java.util.*;

public class skipAndLimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().skip(1).limit(7).forEach(System.out::print);
    }
}
