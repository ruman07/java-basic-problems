package problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveNonZeroNumberToEnd {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,0,-3,5,0,7,2,0,4);

       List<Integer> moveZerotoEnd =  Stream.concat(nums.stream().filter(n->n!=0), nums.stream().filter(n->n==0)).collect(Collectors.toList());

        System.out.println("non zero element are :"+ moveZerotoEnd);

    }
}
