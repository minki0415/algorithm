package dfs;

import java.util.Scanner;

public class DuplicatePermutation {
    static int n, m;
    static int[] pm;
    public void dfs(int L) {
        if(L == m) {
            for(int x : pm) System.out.print(x+ " ");
            System.out.println();
        }else {
            for(int i = 1 ; i <= n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }
    }
    public static void main(String[] args) {
        DuplicatePermutation d = new DuplicatePermutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        d.dfs(0);
    }
}
