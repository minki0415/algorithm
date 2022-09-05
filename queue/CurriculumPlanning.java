package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//public class CurriculumPlanning {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String seq = br.readLine();
//        String cur = br.readLine();
//
//        Queue<Character> q = new LinkedList<>();
//        for(char x : seq.toCharArray()) {
//            q.offer(x);
//        }
//
//        for(char x : cur.toCharArray()) {
//            if(q.isEmpty()) break;
//            else if(q.peek() == x) q.poll();
//        }
//
//        if(q.isEmpty()) System.out.println("YES");
//        else System.out.println("NO");
//    }
//}

public class CurriculumPlanning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seq = br.readLine();
        String cur = br.readLine();

        Queue<Character> q = new LinkedList<>();
        for(char x : seq.toCharArray())  q.offer(x);

        String answer = "YES";
        for(char x : cur.toCharArray()) {
            if(q.contains(x)) {
                if(x != q.poll()) {
                    answer = "NO";
                    break;
                }
            }
        }
        if(!q.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
