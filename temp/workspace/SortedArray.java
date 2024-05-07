package workspace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedArray {

    public static void main(String[] args) {

        // sort array using bubble sort
        int[] arr = {55,87,1,9,22,5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println("Sorted array:: "+Arrays.toString(arr));


       // Find third largest number
        Integer i = List.of(55, 87, 1, 9, 22, 5).stream()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("Third largest: "+i);

        // query to fetch salary by dept

        // select rownum p.dept from  (select * from employee group by dept order by salary desc) P

    }

}
