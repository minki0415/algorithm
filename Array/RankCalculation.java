package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//public class RankCalculation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 0 ; i < n ; i++) {
//            arr.add(sc.nextInt());
//        }
//
//        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
//        Collections.sort(arr2, Collections.reverseOrder());
//
//        for(int x : arr) {
//            System.out.print(arr2.indexOf(x) + 1 + " ");
//        }
//    }
//}

public class RankCalculation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] arr1 = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        Integer[] arr2 = arr1.clone();
        Arrays.sort(arr1, Collections.reverseOrder());
        for(int i = 0 ; i < n ; i++) {
            System.out.print(Arrays.asList(arr1).indexOf(arr2[i]) + 1 + " ");
        }
        kb.close();
    }

}
