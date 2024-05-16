package workspace;

import java.util.ArrayList;
import java.util.Collections;

public class MastercardCharacterSumAndDifference {

    /**
     * a=2^0 =1, b=2^1=2, c=2^2=4, d=2^3=8 and so on
     * string a= "ababa"
     * string b = "ab" sum(a)= 1+2+1+2+1 = 7
     * find result = sum(a)-sum(c)
     * convert result back to string so if result is 9
     * return string can be: da
     * @param args
     */

    public static void main(String[] args) {
        String a = "ababa";
        String b = "c";

        int sumA = calculateSum(a);
        int sumB = calculateSum(b);

        int result = sumA - sumB;

        String resultString = convertResultToString(result);

        System.out.println("Result: " + resultString);
    }

    private static int calculateSum(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += getCharacterValue(ch);
        }
        return sum;
    }

    private static int getCharacterValue(char ch) {
        return (int) Math.pow(2, ch - 'a');
    }

    private static String convertResultToString(int result) {
        System.out.println("Integer Result::"+result);
        ArrayList<Character> chars = new ArrayList<>();
        int power = 0;
        while (result > 0) {
            if ((result & 1) == 1) {
                chars.add((char) ('a' + power));
            }
            power++;
            result >>= 1;
        }
        Collections.reverse(chars); // Optional: to maintain order from highest to lowest power
        StringBuilder resultString = new StringBuilder();
        for (char ch : chars) {
            resultString.append(ch);
        }
        return resultString.toString();
    }
}
