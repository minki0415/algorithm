package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++) {
            q.offer(i+1);
        }

        int count = 0;
        while(q.size() > 1) {
//            System.out.println(q.toString());
            if(count == k-1) {
                q.poll();
                count = 0;
            }
            else {
                q.offer(q.poll());
                count++;
            }
        }
        System.out.println(q.poll());
    }
}
