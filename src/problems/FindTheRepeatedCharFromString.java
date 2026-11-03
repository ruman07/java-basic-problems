package problems;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheRepeatedCharFromString {
    public static void main(String[] args) {

        String name = "Kamran";
        Optional<Map.Entry<Character, Long>> first = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet().stream().filter(ch -> ch.getValue() > 1).findFirst();

        System.out.println("First repeating character : "+ first);
    }
}
