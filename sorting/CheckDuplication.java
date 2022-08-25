package sorting;

import java.lang.reflect.Array;
import java.util.*;

// 중복확인
public class CheckDuplication {

    public static void solution1(int n, ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(arr);

        if(arr.size() == set.size()) System.out.println("U");
        else System.out.println("D");
    }

    public static String solution2(int n, ArrayList<Integer> arr) {
        String answer = "U";
        Collections.sort(arr);

        for(int i = 0 ; i < n-1 ; i++) {
            if(arr.get(i) == arr.get(i+1)) return "D";
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n ; i++) {
            arr.add(sc.nextInt());
        }

        solution1(n, arr);
        System.out.println(solution2(n, arr));
    }
}
