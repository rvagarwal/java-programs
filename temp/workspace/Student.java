package workspace;

import java.util.Arrays;
import java.util.List;

public final class Student {

    private final String name;
    private final Integer id;

    List<Integer> marks;

    public Student(String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }


    public static void main(String[] args) {

        // assume each number is floor count of building as sun rise in east
        // in 1st builting to east all floor will get sunlight in second (5-9 = 4) 4 floor will get sunlight
        // so output will be  1, 1,  3,  0,  0, 6,  4 ,5

        //Input:  west 20, 19, 18, 5, 10, 15, 9, 5 east
        //Output: 1, 1,  3,  0,  0, 6,  4 ,5

        int[] result = countLess(new int[]{20, 19, 18, 5, 10, 15, 9, 5});
        System.out.println(Arrays.toString(result));
    }

    public static int[] countLess(int[] arr) {
        int[] result = new int[arr.length];
        int i = arr.length - 1;
        int maxHeight = 0;
        while (i >= 0) {
            if (arr[i] > maxHeight) {
                result[i] = arr[i] - maxHeight;
                maxHeight = arr[i];

            } else {
                result[i] = 0;
            }
            i--;
        }
        return result;
    }


    //-----------------------------------------------------------------------

    // student table
    // id, name
    // 1, abc
    // 2, pqr
    // 3, abc

    //select cnt, name from {select count(id) as cnt,name from table group by name} t where t.cnt>1;
}
