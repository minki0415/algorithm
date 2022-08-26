package sorting;

import java.util.Scanner;

// 좌표정렬
public class CoordinateSort {
    public static void solution1(int n, int[][] arr) {
        for(int i=1 ; i<n ; i++) {
            int[] temp = arr[i];
            int j;
            for(j = i-1 ; j >= 0 ; j--){
                if(arr[j][0] > temp[0]) arr[j+1] = arr[j];
                else if(arr[j][0] == temp[0] && arr[j][1] > temp[1]) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }

        for(int[] x : arr) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public static void solution2(int n, int[][] arr) {
        for(int i=0 ; i<n-1 ; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j][0] < arr[idx][0]) idx = j;
                else if(arr[j][0] == arr[idx][0] && arr[j][1] < arr[idx][1]) idx = j;
            }
            int[] temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for(int[] x : arr) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        solution1(n, arr);
        solution2(n, arr);

    }
}


