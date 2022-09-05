package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 1;
        Queue<Person> q = new LinkedList<>();
        for(int i = 0 ; i<n ; i++) {
            q.add(new Person(i, arr[i]));
        }

        while(!q.isEmpty()) {
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority > tmp.priority) {
                    q.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                if(tmp.id == m) System.out.println(answer);
                else answer++;
            }
        }

    }
}
