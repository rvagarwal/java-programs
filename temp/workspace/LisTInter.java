package workspace;

import java.util.ArrayList;
import java.util.List;

public class LisTInter {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------
        // print or collect numbers starting with 1
        // input array = 1,5,15,18,145,245
        //output = 1,15,18,145

        List<Integer> integers = List.of(1, 5, 18, 14, 145, 245);
        integers.stream().filter(integer -> String.valueOf(integer).startsWith("1")).forEach(System.out::println);

       ////-----------------------------------------------------------------------
        // Divide list in chunk of size 3
        List<List<Integer>> chunks = new ArrayList<>();
        for (int i = 0; i < integers.size(); i += 3) {
            chunks.add(integers.subList(i, Math.min(i + 3, integers.size())));
        }

        System.out.println(chunks);

    }
}
