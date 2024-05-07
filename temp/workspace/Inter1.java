package workspace;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employees {
    String id;
    LocalDate createdOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return Objects.equals(getId(), employees.getId()) && Objects.equals(getCreatedOn(), employees.getCreatedOn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreatedOn());
    }

    @Override
    public String toString() {
        return "workspace.Employees{" +
                "id='" + id + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }

    public Employees(String id, LocalDate createdOn) {
        this.id = id;
        this.createdOn = createdOn;
    }

    public String getId() {
        return id;
    }


    public LocalDate getCreatedOn() {
        return createdOn;
    }

}

public class Inter1 {

    public static void main(String[] args) {
        int[] inoutarr = new int[]{3, 0, 7, 0, 8, 6};
        //output array 3,6,7,8,0,0;   put all 0 at end of array
        System.out.println("INPUT: " + Arrays.toString(inoutarr));
//        int count = (int) Arrays.stream(inoutarr).filter(a -> a == 0).count();
//        System.out.println("Zero count:"+count);
//        Collections.rotate(Arrays.asList(inoutarr),count);
        sortNonZero2(inoutarr);
        System.out.println("Solution: " + Arrays.toString(inoutarr));


        //-----------------------------------------------------------------------
        //input ["and","for","Okay","Part","Java","Ok123"]
        //output [["and","for"]["Okay","Part","Java"]["Ok123"]]
        List<String> listInput = Arrays.asList("and", "for", "Okay", "Part", "Java", "Ok123");
        System.out.println("INPUT: " + listInput);
        List<String> lower = new ArrayList<>();
        List<String> upper = new ArrayList<>();
        List<String> alphanumeric = new ArrayList<>();
        listInput.forEach(input -> {
            if (input.matches("[a-z]*")) {
                lower.add(input);
            } else if (input.matches("[a-zA-Z]*")) {
                upper.add(input);
            } else if (input.matches("[a-zA-Z0-9]*")) {
                alphanumeric.add(input);

            }

        });
        List<List<String>> lower1 = List.of(lower, upper, alphanumeric);
        System.out.println("Solution: " + lower1);


        //-----------------------------------------------------------------------
        //  Sort list of employees by creted on time in descending order
        // id = 104, amount = 195.560000, number = SR048OPR, createdOn = 2021-04-22;
        // id = 102, amount = 229.750000, number = QJ098OJH, createdOn = 2020-09-24
        //id = 101, amount = 496.670000, number = SQ078OPQ, createdOn = 2020-04-24
        Employees e1 = new Employees("1", LocalDate.now());
        Employees e2 = new Employees("2", LocalDate.now().plusDays(1));
        Employees e3 = new Employees("3", LocalDate.now().plusDays(2));
        List<Employees> employeesList = List.of(e1, e2, e3);

        List<Employees> sortedEmployee = employeesList.stream()
                .sorted(Comparator.comparing(Employees::getCreatedOn).reversed())
                .collect(Collectors.toList());
        System.out.println("sortedEmployee: " + sortedEmployee);

    }

    public static void sortNonZero1(int[] arr) {
        int n = arr.length;
        int left = 0;

        // Move all non-zero elements to the left
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[left++] = arr[i];
            }
        }

        // Fill the remaining elements with zeros
        while (left < n) {
            arr[left++] = 0;
        }

        // Sort the non-zero elements
        Arrays.sort(arr, 0, left);
    }

    public static void sortNonZero(int[] arr) {
        int n = arr.length;
        int left = 0;

        // Move all non-zero elements to the left
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, left++, i);
            }
        }
        Arrays.sort(arr, 0, left);
    }

    // Helper function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortNonZero2(int[] digits) {
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                swap(digits, count++,i);
            }
        }
        System.out.println("count: "+count);

        Arrays.sort(digits, 0, count);
    }

}
