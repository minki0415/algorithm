package slidingwindow;

import java.util.Scanner;

//public class MaxLenSubsequence {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i++) {
//            arr[i] =sc.nextInt();
//        }
//
//        int answer = 0;
//        int rt = 0;
//        for(int lt = 0; lt < n ; lt++) {
//            int temp = 0; // 각 lt의 길이
//            int count = 0; // 0의 개수
//            rt = lt;
//            while(count <= k && rt < n) {
//                if(arr[rt] == 1) {
//                    temp++;
//                    rt++;
//                }else {
//                    count++;
//                    temp++;
//                    rt++;
//                }
//            }
//            System.out.println(temp);
//            answer = Math.max(answer, temp-1);
//        }
//        System.out.println(answer);
//
//    }
//}

public class MaxLenSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] =sc.nextInt();
        }

        int answer = 0, cnt = 0, lt = 0;
        for(int rt = 0; rt < n ; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        System.out.println(answer);

    }
}
