package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Island2 {
    static int n, answer = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0 ,-1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point> q = new LinkedList<>();
    public void bfs(int x, int y, int[][] arr) {
        q.add(new Point(x, y));
        while(!q.isEmpty()) {
            Point pos = q.poll();
            for(int i = 0 ; i < 8 ; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]==1){
                    arr[nx][ny] = 0;
                    q.add(new Point(nx, ny));
                }
            }
        }
    }
    public void solution(int[][] arr) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(arr[i][j] == 1) {
                    answer++;
                    arr[i][j] = 0;
                    bfs(i, j, arr);
                }
            }
        }
    }

    public static void main(String[] args) {
        Island2 t = new Island2();
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
