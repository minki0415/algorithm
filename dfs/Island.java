package dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Island {
    static int n, answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0 ,-1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public void dfs(int x, int y, int[][] arr) {
        for(int i = 0 ; i < 8 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1){
                arr[nx][ny] = 0;
                dfs(nx, ny, arr);
            }
        }
    }
    public void solution(int[][] arr) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(arr[i][j] == 1) {
                    answer++;
                    arr[i][j] = 0;
                    dfs(i, j, arr);
                }
            }
        }
    }
    public static void main(String[] args) {
        Island t = new Island();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        t.solution(arr);
        System.out.println(answer);
    }
}
