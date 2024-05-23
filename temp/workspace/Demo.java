package workspace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class A{
    private String str;

    public A () {}

    public A(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "workspace.A{" +
                "str='" + str + '\'' +
                '}';
    }
}

class B extends A{

}

class C extends B {

}

class Demo{
    int a;


    public static void main(String[] args) {

        //-------------------------------------------------------
        //sort list of objects by a field value of object
        A a1 = new A("d");
        A a2 = new A("a");
        A a3 = new A("f");
        A a4 = new A("b");
        List<A> listOfA = List.of(a1, a2, a3, a4);
        listOfA.stream().sorted(Comparator.comparing(A::getStr)).forEach(System.out::println);

        //-------------------------------------------------------
        //sort list of objects by a field value of object reverse
        listOfA.stream().sorted(Comparator.comparing(A::getStr, Comparator.reverseOrder())).forEach(System.out::println);



//----------------------------------------------------------------------
        //Find the most repeated letter of string
        String strWithDup = "kdhgornnddffffggg";
        List<String> splitList = Arrays.asList(strWithDup.split(""));
        String key = splitList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                            .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println("max repeated letter: "+key);

        // alternate to above using internal comparator given by Map.Entry
        splitList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
       .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();


        //-------------------------------------------------------------------
        // sort number list
        List<Long> numberList = List.of(1l,2l,3l, 5l,66l,45l,96l,5l);
        System.out.println("Sorted number list");
        numberList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        //-----------------------------------------------------------------------
        // Find largest number from the list
        Long maxNum = numberList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("largest number::"+maxNum);

        //-----------------------------------------------------------------------
        // Find second largest number from the list
        //second largest number
        Long secondLargestNum = numberList.stream().sorted(Comparator.reverseOrder()).skip(1).max(Comparator.naturalOrder()).get();
        System.out.println("secondLargestNum::"+secondLargestNum);

        //-----------------------------------------------------------------------
        // top 3 largest numbers from list
        System.out.println("top 3 number list");
        numberList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //-----------------------------------------------------------------------
        // find all duplicates along with count/frequency
        System.out.println("duplicate with count in numlist");
        numberList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1l).forEach(System.out::println);

        //-----------------------------------------------------------------------
        // find longest and shortest names
        List<String> names = List.of("Mumbai","Delhi","Bengaluru","Kolkata");
        String longest = names.stream().collect(Collectors.toMap(s -> s, s -> s.length())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        String shortest = names.stream().collect(Collectors.toMap(s -> s, s -> s.length())).entrySet().stream().max(Map.Entry.comparingByValue(Comparator.reverseOrder())).get().getKey();
        System.out.println("Longest::"+ longest);
        System.out.println("Shortest::"+shortest);

        //-----------------------------------------------------------------------
        //Print reverse of string
        String reversedName = new StringBuilder("Delhi").reverse().toString();
        System.out.println("reversedName::"+ reversedName);



    }
}
