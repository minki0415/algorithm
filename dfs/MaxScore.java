package dfs;

import java.util.Scanner;

public class MaxScore {
    static int n, m;
    static int answer = Integer.MIN_VALUE;
    boolean flag = false;
    public void dfs(int[] score, int[] time, int L, int sum, int limit){
        if(limit > m) return;
        if(L == n) {
            answer = Math.max(answer, sum);
        }else {
            dfs(score, time, L+1, sum+score[L], limit+time[L]);
            dfs(score, time, L+1, sum, limit);
        }
    }
    public static void main(String[] args) {
        MaxScore t = new MaxScore();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // n개의 문제
        m = sc.nextInt(); // 제한시간
        int[] score = new int[n];
        int[] time = new int[n];
        for(int i = 0 ; i < n ; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        t.dfs(score, time, 0, 0, 0);
        System.out.println(answer);
    }
}
