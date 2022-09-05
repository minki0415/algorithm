package hash;

import java.util.HashMap;
import java.util.Scanner;

//public class TypesOfSalePrice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < k ; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//        System.out.print(map.size() + " ");
//
//        int lt = 0, rt = k;
//        while(rt < n){
//            if(map.get(arr[lt]) == 1)  map.remove(arr[lt]);
//            else map.put(arr[lt], map.get(arr[lt]) - 1);
//
//            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
//
//            System.out.print(map.size() + " ");
//            lt++;
//            rt++;
//        }
//    }
//}

public class TypesOfSalePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }


        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < k ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");

        for(int i = 0 ; i < n-k ; i++) {

            if(map.get(arr[i]) > 1) map.put(arr[i], map.get(arr[i])-1);
            else map.remove(arr[i]);
            map.put(arr[i+k], map.getOrDefault(arr[i+k], 0) + 1);

            System.out.print(map.size() + " ");

        }
    }
}