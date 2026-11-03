package problems;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromTheList {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1,3,4,4,6,7,7,7,8,9);
        // frequency
        Map<Integer, Long> collect = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        // frequency
        System.out.println("feq : " + collect );

        //duplicate value
        Set<Integer> collect1 = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue()>1)
                .map(n -> n.getKey())
                .collect(Collectors.toSet());
        System.out.println("duplicate:"+ collect1);
    }
}
