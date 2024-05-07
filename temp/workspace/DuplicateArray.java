package workspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateArray {

    public static void main(String[] args) {
        //-----------------------------------------------------------------------
        // find frequency of duplicae elements in arrnum without using java collections
        int[] arrnnum = { 10, 8, 6, 10, 7, 8, 3, 10 };
        int[] duplicae = new int[11];
        for (int i = 1; i < arrnnum.length; i++) {
            duplicae[arrnnum[i]]++;
        }
        for (int i = 0; i < duplicae.length; i++) {
            System.out.println(i + " : " + duplicae[i]);
        }


        //-----------------------------------------------------------------------
        // find sum of digits
        int x = 697;

        int sumOfDigits = getSumOfDigits(x);
        System.out.println("The number " + x + " has the following sum of its digits: " + sumOfDigits);

        //-----------------------------------------------------------------------
        // check anagram
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        if (isAnagram) {
            System.out.println("The two strings are Anagrams");
        } else {
            System.out.println("The two strings are not Anagrams");
        }

        //-----------------------------------------------------------------------
        //sort the 2D list of numbers output should be 2D list with sorted lists
        // {{8,2,1,3,4,5,6,2,5,3,5,6,63},{9,2,1,34,5,5,6,8,9,5,4,3,6,7,8}};
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(8, 2, 1, 3, 4, 5, 6, 2, 5, 3, 5, 6, 63));
        list.add(Arrays.asList(9, 2, 1, 34, 5, 5, 6, 8, 9, 5, 4, 3, 6, 7, 8));
        List<List<Integer>> collect = list.stream()
                .map(list3 -> list3.stream().distinct().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(collect);

        int[] arr1 = { 8, 2, 1, 3, 4, 5, 6, 2, 5, 3, 5, 6, 63 };
        int[] arr2 = { 9, 2, 1, 34, 5, 5, 6, 8, 9, 5, 4, 3, 6, 7, 8 };
        List<List<Integer>> collect2d = Stream.of(arr1, arr2)
                .map(arr -> Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(collect2d);
    }

    private static int getSumOfDigits(int x) {

        // with while loop

        /* int sum=0;
         while (x > 0){
         int digit = x % 10;
         x /= 10;
         sum=sum+digit;
         }*/


        // with recursion
        if (x == 0)
            return 0;
        return x % 10 + getSumOfDigits(x / 10);
    }

    /**
     * function to check if two strings are anagram
     * @param str1
     * @param str2
     * @return true if two string are anagram
     * example listen and silent we can rearrange letters to get silent from listen.
     */
    public static boolean areAnagrams(String str1, String str2) {

        int collect = str1.toLowerCase().chars().sorted().sum();

        int collect2 = str2.toLowerCase().chars().sorted().sum();
        return collect == collect2;

    }

}
