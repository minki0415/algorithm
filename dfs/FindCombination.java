package dfs;

import java.util.Scanner;

public class FindCombination {
    static int[] combination;
    static int n, m;
    public void dfs(int L, int s) {
        if(L == m){
            for(int x : combination) System.out.print(x + " ");
            System.out.println();
        }else {
            for(int i = s ; i <= n; i++) {
                combination[L] = i;
                dfs(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        FindCombination t = new FindCombination();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combination = new int[m];
        t.dfs(0, 1);
    }
}
