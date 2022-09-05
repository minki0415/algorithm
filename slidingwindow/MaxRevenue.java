package slidingwindow;

import java.util.Scanner;

public class MaxRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            arr[i] = sc.nextInt();
        }


        int temp = 0;
        for(int i = 0 ; i < K ; i++) temp += arr[i];

        int max = Integer.MIN_VALUE;
        int lt = 0, rt = K;
        while(rt < N) {
            if(temp > max) max = temp;
            temp = temp - arr[lt] + arr[rt];
            lt++;
            rt++;
        }

        System.out.println(max);
    }
}
