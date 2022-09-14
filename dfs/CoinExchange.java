package dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {
    static int n, m;
    static int answer = Integer.MAX_VALUE;

    public void dfs(int L, int sum, Integer[] type){
        if(L >= answer) return; // 탐색횟수 줄이기 (1)
        if(sum > m) return; // 탐색횟수 줄이기 (2)
        if(sum == m) {
            answer = Math.min(L, answer);
        }else{
            for(int i = 0 ; i < n ; i++) dfs(L + 1, sum + type[i], type);
        }
    }

    public static void main(String[] args) {
        CoinExchange c = new CoinExchange();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] type = new Integer[n];
        for(int i = 0 ; i < n ; i++) type[i] = sc.nextInt();
        Arrays.sort(type, Collections.reverseOrder());
        m = sc.nextInt();
        c.dfs(0,0, type);
        System.out.println(answer);
    }
}
