package array;

import java.util.Scanner;

public class Peaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i = 1 ; i < n+1 ; i++) {
            for(int j = 1 ; j < n+1 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 1 ; i < n+1 ; i++) {
            for(int j = 1; j < n+1 ; j++) {
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j+1]) count++;
            }
        }
        System.out.println(count);


        sc.close();
    }
}