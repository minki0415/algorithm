package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    public int x, y;
    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Tomato {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr, day;
    static int n, m;
    static Queue<Point2> q = new LinkedList<>();
    public void bfs() {
        while(!q.isEmpty()){
            Point2 tmp = q.poll();
            for(int i = 0 ; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    q.offer(new Point2(nx, ny));
                    day[nx][ny] = day[tmp.x][tmp.y] +1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Tomato t = new Tomato();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];
        day = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1) q.offer(new Point2(i, j));
            }
        }
        t.bfs();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
           for(int j = 0 ; j < m ; j++) {
               if(arr[i][j] == 0) flag = false;
           }
        }
        if(flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, day[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
