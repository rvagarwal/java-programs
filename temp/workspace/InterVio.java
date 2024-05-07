package workspace;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class InterVio {




    public static void main(String[] args) {

        // 2 integer arrays sorted merge in 3rd array
        // merge 2 sorted array
        int[] arr1 = {10,15,19};
        int[] arr2 = {8,14,17};

        int[] result = new int[arr1.length+ arr2.length];

        mergeSortedArrays(arr1, arr2, result);

        System.out.println("merged sorted array:: ");
        System.out.println(Arrays.toString(result));

        //-----------------------------------------------------------------------
        //Find second largest number from array
        //
        int[] arr3={13,55,7,99,53};
        int secondLargest = findSecondLargest(arr3);
        System.out.println("2nd large:"+secondLargest);


        //-----------------------------------------------------------------------
        //Playing with IntStream and IntSummaryStatistics
        //
        //
        int intsum= Arrays.stream(arr3).boxed().mapToInt(Integer::intValue).sum();
        int sum = Arrays.stream(arr3).boxed().reduce(0, (x, y) -> x + y);
        System.out.println("intsum::"+intsum+"sum::"+sum);
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr3).boxed().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics.toString());







    }
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a second largest element");
        }
        return secondLargest;
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            k++;
            j++;
        }
    }
}
