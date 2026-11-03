package problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class UsingStreamFreqOfNum {

    public static Map<Integer,Long> frequencyOfEachNumber(int [] nums){
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(),Collectors.counting()));
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 4, 5, 7, 7, 7, 8};

        Map<Integer, Long> freq = frequencyOfEachNumber(nums);

        freq.forEach((k,v)-> System.out.println(k+"->"+v));

    }
}
