import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Solution {

    public static String solution(String exp1, String exp2) {

        String answer ="";

        exp1 = exp1.replace("+ ", "");
        exp1 = exp1.replace("^", "");

        exp2 = exp2.replace("+ ", "");
        exp2 = exp2.replace("^", "");


        TreeMap<Integer, Integer> map1 = new TreeMap<>(Collections.reverseOrder());
        String[] arr1 = exp1.split(" ");
        System.out.println(Arrays.toString(arr1));
        for(String x : arr1) {
            map1.put(Integer.parseInt(x.split("x")[1]), map1.getOrDefault(Integer.parseInt(x.split("x")[1]),0) + Integer.parseInt(x.split("x")[0]));
        }

        String[] arr2 = exp2.split(" ");
        for(String x : arr2) {
            map1.put(Integer.parseInt(x.split("x")[1]), map1.getOrDefault(Integer.parseInt(x.split("x")[1]),0) + Integer.parseInt(x.split("x")[0]));
        }

        StringBuilder sb = new StringBuilder();

        for(int x : map1.keySet()) {
            if(x == map1.lastKey()) {
                sb.append(map1.get(x));
                sb.append("x^");
                sb.append(x);
            }else{
                sb.append(map1.get(x));
                sb.append("x^");
                sb.append(x);
                sb.append(" + ");
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String exp1 = "2x^5 + 3x^3 + 2x^1";
        String exp2 = "6x^6 + 4x^4 + 3x^3 + 2x^2";

        String exp3 = "12x^15 + 3x^3 + 2x^1";
        String exp4 = "16x^16 + 4x^4 + 3x^3 + 2x^2";

        System.out.println(solution(exp1, exp2));
    }

}
