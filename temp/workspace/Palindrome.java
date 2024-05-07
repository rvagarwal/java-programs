package workspace;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Palindrome {

    public static void main(String[] args) {
        String palString = "dcaaabbbaaacd";

        List<String> list = Arrays.asList(palString.split(""));
        Map<String, Long> charCountMap = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("charMap"+ charCountMap);
        boolean whetherPalindrome = false;
        if(list.size()%2==0){
            whetherPalindrome = charCountMap.values().stream().allMatch(val -> val%2l==0);
        }else {
            long count = charCountMap.values().stream().filter(val ->val%2l!=0).count();

            whetherPalindrome = count<=1l && charCountMap.values().stream().filter(val-> val%2l==0).allMatch(val -> val%2l==0);
        }
        System.out.println("whether Palindrome: "+ whetherPalindrome);

    }
}
