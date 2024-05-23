package workspace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Int12 {

    public static void main(String[] args) {

        //Print the word with longest length
        String str = "India is our country and we love it";
        List<String> list = Arrays.asList(str.split(" "));
        Map.Entry<String, Integer> stringIntegerEntry = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst().get();
        System.out.println( stringIntegerEntry.getKey());





    }
}
