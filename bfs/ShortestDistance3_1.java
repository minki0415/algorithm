package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리
public class ShortestDistance3_1 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public void bfs(int v) {
        ch = new int[n+1];
        ch[v] = 1;
        q.offer(v);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0 ; i < len ; i++) {
                int x = q.poll();
                for(int j = 0; j < n; j++){
                    if(graph[x][j] == 1 && ch[j] == 0) {
                        ch[j] = 1;
                        q.offer(j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ShortestDistance3_1 s = new ShortestDistance3_1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][m+1];
        ch = new int[n+1];
        for(int i = 0 ; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;

    }
}
