package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기
public class FindCalf {

    int answer = 0;
    int[] dis={-1, 1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0 ; i < len; i++) {
                int x = q.poll();
                for(int j = 0 ; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx == e) return L+1;
                    if(nx >=1 && nx <= 10000 && ch[nx] == 0) {
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
        FindCalf b = new FindCalf();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(b.bfs(s, e));


    }
}
