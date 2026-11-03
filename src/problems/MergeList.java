package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(1,2,3,4,5);
        List<Integer> num2 = Arrays.asList(6,7,8);

       List<Integer> mergeList = Stream.concat(num1.stream(),num2.stream()).toList();
        System.out.println("mergeList : " + mergeList );
    }
}
