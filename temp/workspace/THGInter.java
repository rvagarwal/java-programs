package workspace;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class THGInter {
    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "torom";
        System.out.println("Are string anagram:"+ checkAnagram(str1, str2) );
        System.out.println("Are string anagram:"+ checkAnagramInSubset("stop", "pot") );
    }

    private static boolean checkAnagram(String str1, String str2) {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    private static boolean checkAnagramInSubset(String str1, String str2) {
        if (str2.length()>str1.length()){return false;}

        String collect1 = str1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        String collect2 = str1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        return collect1.contains(collect2);


    }

}
