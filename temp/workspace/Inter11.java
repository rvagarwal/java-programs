package workspace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inter11 {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------
        // separate string by space and add in List of word w/o using stream
        String str = "I am java developer ";

        char[] charArray = str.toCharArray();
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] != ' '){
                sb.append(charArray[i]);
            }
            else {
                result.add(sb.toString());
                sb = new StringBuilder("");
            }


        }
        System.out.println(result);

        //-----------------------------------------------------------------------
        // we have employee with name and dept return highest salaried employee from each dept.

        Employ e1 = new Employ(1,"Raj","A",50000);
        Employ e2 = new Employ(2,"Raja","B",10000);
        Employ e3 = new Employ(3,"Rajat","A",7000);
        Employ e4 = new Employ(4,"Ram","B",8000);
        List<Employ> empList = List.of(e1, e2, e3, e4);

        List<Employ> collect = empList.stream().collect(Collectors.groupingBy(e -> e.dept()))
                .entrySet()
                .stream().map(entry -> entry.getValue().stream().max(Comparator.comparing(Employ::salary)).get())
                .collect(Collectors.toList());
        System.out.println(collect);


    }

// /employee/{id}
}
record Employ(Integer id, String name, String dept, Integer salary){

}
