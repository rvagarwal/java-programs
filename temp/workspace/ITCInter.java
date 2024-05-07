package workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ITCInter {

    public static void main(String[] args) {

//                Top k frequency numbers	Array = {1, 3, 5, 12, 11, 12, 11, 12 },  k = 3
//
//                output :: [12, 11, 5]

        List<Integer> integers = List.of(1, 3, 5, 12, 11, 12, 11, 12);
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < integers.size(); i++) {

            Integer cnt = frequencyMap.getOrDefault(integers.get(i), 0);
            cnt = cnt+1;
            frequencyMap.put(integers.get(i), cnt);


        }
        frequencyMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).forEach(entry -> System.out.println(entry.getKey()));

//----------------------------------------------------------------------------------
        //input :: String str = "aaabbaacccc"
        // output = a3b2a2c4

        String inputStr = "aaabbaacccc";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
                count++;
            } else {
                sb.append(inputStr.charAt(i)).append(count);
                count = 1;
            }
        }

        sb.append(inputStr.charAt(inputStr.length() - 1)).append(count);

        System.out.println(sb);


    }


}
