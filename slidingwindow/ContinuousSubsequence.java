package slidingwindow;

import java.util.Scanner;

//public class ContinuousSubsequence {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i = 0 ; i < N ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int lt = 0, rt = 1, count = 0;
//        int temp = arr[lt];
//        while(rt < N) {
//            System.out.print(rt + " ");
//            if(temp ==  M) {
//                count++;
//                temp = temp - arr[lt] + arr[rt];
//                lt++;
//                rt++;
//            }else if(temp < M) {
//                temp = temp + arr[rt];
//                rt++;
//            }else {
//                temp = temp - arr[lt];
//                lt++;
//            }
//        }
//        System.out.println(count);
//
//        sc.close();
//    }
//}

public class ContinuousSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0, lt = 0, sum = 0;
        for(int rt = 0; rt < N ; rt++) {
            sum += arr[rt];
            if(sum == M) answer++;
            while(sum >= M) {
                sum -= arr[lt++];
                if(sum == M) answer++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
