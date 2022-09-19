package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Maze2 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr, dis;
    public void bfs(int x, int y) {
        Queue<Point> q = new LinkedList();
        q.offer(new Point(x, y));
        arr[x][y] = 1;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx<=6 && ny>=0 && ny<=6 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Maze2 t = new Maze2();
        Scanner sc = new Scanner(System.in);
        arr = new int[7][7];
        dis = new int[7][7];
        for(int i = 0 ; i < 7 ; i++) {
            for(int j = 0 ; j < 7 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        t.bfs(0, 0);
        if(dis[6][6] == 0) System.out.println(-1);
        else System.out.println(dis[6][6]);

    }
}
