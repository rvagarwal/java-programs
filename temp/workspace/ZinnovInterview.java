package workspace;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZinnovInterview {



    public static void main(String[] args) {

        //Print count of duplicate number
        List<Integer> intList = List.of(1,2,2,4,8,3,9,8,0,5,7);
        Map<Integer, Long> collect = intList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1l).collect(Collectors.toMap(a -> a.getKey(), a -> a.getValue()));
        System.out.println(collect);

    }
}


