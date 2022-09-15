package dfs;

import java.util.Scanner;

// 수열 추측하기
public class GuessSequence {
    static int[] b, p, ch; //컴비네이션 값, 순열, 체크
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];
    public int combination(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
    public void dfs(int L, int sum) {
        if(flag) return;
        if(L == n) {
            if(sum == f) {
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        }else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L+1, sum+p[L]*b[L]);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        GuessSequence t = new GuessSequence();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i = 0 ; i < n; i++) {
            b[i] = t.combination(n-1, i);
        }
        t.dfs(0, 0);
    }
}
