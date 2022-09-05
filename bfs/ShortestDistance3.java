package bfs;

import java.util.*;

// 그래프 최단거리
// 배열 활용
public class ShortestDistance3 {
    static int n, m = 0;
    static int[][] graph;
    static int[] ch, answer;

    public void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        int L = 0;
        q.offer(v);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i = 0 ; i <= n ; i++) {
               if(graph[x][i] == 1 && ch[i] == 0){
                   ch[i] = 1;
                   q.offer(ch[i]);
               }else if(graph[x][i] == 1 && ch[i] == 1) {
                   answer[i] = L+1;
                }
            }
            L++;
        }
    }

    public static void main(String[] args) {
        ShortestDistance3 s = new ShortestDistance3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        answer = new int[n+1];
        for(int i = 0 ; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;

        System.out.println(Arrays.deepToString(graph));
        s.bfs(1);
        for(int i = 2; i <= n; i++) {
            System.out.println(i + " : " + answer[i]);
        }

    }
}
