package workspace;

import java.util.Arrays;
import java.util.Comparator;

public class Int123 {

    public static void main(String[] args) {
        int[] arr = {87,85,80,91,75,57};

        //-----------------------------------------------------------------------
        // find second largest number from array using stream
        Integer secondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println("second largest ::"+ secondLargest);

        //-----------------------------------------------------------------------
        //Find minimum number from array using stream
        Integer minNumber = Arrays.stream(arr).boxed().min(Comparator.naturalOrder()).get();
        System.out.println("Min ::"+ minNumber);




    }
}
