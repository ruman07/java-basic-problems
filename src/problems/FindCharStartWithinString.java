package problems;

import java.util.Arrays;

public class FindCharStartWithinString {

    public static void main(String[] args) {

        String input = " apple banana mango box been fox auto bike";
        char ch = 'b';

       Arrays.stream(input.split(" ")).filter(word -> word.startsWith(String.valueOf(ch))).toList().forEach(System.out::println);

        //System.out.println("char b string : "+ list);
    }
}
