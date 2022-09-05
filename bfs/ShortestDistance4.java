package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리
// 배열 활용
public class ShortestDistance4 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int nx : graph.get(x)) {
                if(ch[nx] == 0) {
                    ch[nx] = 1;
                    q.offer(nx);
                    dis[nx] = dis[x] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        ShortestDistance4 s = new ShortestDistance4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i <= n ; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0 ; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        s.bfs(1);
        for(int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}
