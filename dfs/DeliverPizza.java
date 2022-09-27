package dfs;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class DeliverPizza {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] comb;
    static ArrayList<Point> pz, hs;
    public void dfs(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : comb) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else {
            for(int i =s; i < len; i++) {
                comb[L] = i;
                dfs(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeliverPizza t = new DeliverPizza();
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                int tmp = sc.nextInt();
                if(tmp == 1) hs.add(new Point(i, j));
                else if(tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        comb = new int[m];
        t.dfs(0, 0);
        System.out.println(answer);
    }
}
