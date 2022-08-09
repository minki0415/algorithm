package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxOfCheckboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        ArrayList<Integer> total = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            int temp1 = 0;
            int temp2 = 0;
            for(int j = 0 ; j < n ; j++) {
                temp1 += arr[i][j];
                temp2 += arr[j][i];
            }
            total.add(temp1);
            total.add(temp2);
        }

        int temp3 = 0;
        int temp4 = 0;
        for(int i = 0 ; i < n ; i++) {
            temp3 += arr[i][i];
            temp4 += arr[n-i-1][n-i-1];
        }
        total.add(temp3);
        total.add(temp4);

        System.out.println(Collections.max(total));

        sc.close();
    }
}

// 배열 안만들고 max 값으로만 비교해서 출력
//public class MaxOfCheckboard {
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int [][] arr = new int[n][n];
//
//        for(int i = 0; i < n ; i++) {
//            for(int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//
//        int answer = Integer.MIN_VALUE;
//        int sum1, sum2;
//        for(int i = 0; i < n; i++){
//            sum1 = sum2 = 0;
//            for(int j = 0 ; j < n ; j++) {
//                sum1 += arr[i][j];
//                sum2 += arr[j][i];
//            }
//            answer= Math.max(answer, sum1);
//            answer= Math.max(answer, sum2);
//        }
//
//        sum1 = sum2 = 0;
//        for(int i = 0 ; i < n ; i++) {
//            sum1 += arr[i][i];
//            sum2 += arr[i][n-i-1];
//        }
//        answer= Math.max(answer, sum1);
//        answer= Math.max(answer, sum2);
//
//        System.out.println(answer);
//
//        kb.close();
//
//    }
//
//}
