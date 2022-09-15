package dfs;

import java.util.Scanner;

public class NumberOfCombinations {
    int[][] dy = new int[35][35];

    public int dfs(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
    }
    public static void main(String[] args) {
        NumberOfCombinations t = new NumberOfCombinations();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(t.dfs(n, r));
    }
}
