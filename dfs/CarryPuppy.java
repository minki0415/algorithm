package dfs;

import java.util.Scanner;

public class CarryPuppy {
    static int n, c = 0;
    static int answer = Integer.MIN_VALUE;
    public void dfs(int L, int sum, int[] arr) {
        if(sum > c) return;
        if(L == n) {
            if(sum > answer) answer = sum;
        }else{
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }

    }
    public static void main(String[] args) {
        CarryPuppy C = new CarryPuppy();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        C.dfs(0, 0, arr);
        System.out.println(answer);
    }

}
