package array;

import java.util.Scanner;

public class ScoreCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        for(int i = 0 ; i < n ; i++) {
            if(i == 0) temp[i] = arr[i];
            else if(arr[i] == 1 && arr[i-1] == 1) temp[i] = arr[i] + temp[i-1];
            else temp[i] = arr[i];
        }

        int score = 0;
        for(int x : temp) {
            score += x;
        }

        System.out.println(score);

    }
}
