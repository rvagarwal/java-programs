package workspace;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SynechronInt {



    public static void main(String[] args) {

        // from the array print even numbers
        List<Integer> collect = List.of(2, 5, 9, 8, 4, 7, 11, 12, 16)
                .stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //-----------------------------------------------------------------------
        //
        //Get count of each fruit from list

        List<String> fruits = List.of("Mango","Apple","Banana","Mango","Apple");
        Map<String, Long> collect1 =
                fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

// Second highest salary
// select * from employee e group by e.salary order by e.salary desc offset 1 limit 1;

    }

}
