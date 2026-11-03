package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFreqOfNumber{

    public static Map<Integer, Integer> frequencyOfEachNumber(int[] nums) {
        // LinkedHashMap keeps insertion order so output matches array order
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 7, 7, 7, 8};

        Map<Integer, Integer> freq = frequencyOfEachNumber(nums);

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}