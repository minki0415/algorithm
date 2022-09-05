package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf2 {
    int[] dist = {-1, 1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    private int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len ; i++) {
                int n = q.poll();
                for(int j = 0 ; j < 3 ; j++) {
                    int nx = n + dist[j];
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindCalf2 f = new FindCalf2();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(f.bfs(s, e));
    }

}