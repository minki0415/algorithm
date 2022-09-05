package hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// TreeSet 활용 문제
// 중복제거, 오름차순 정렬
public class KthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet<Integer> answers = new TreeSet<>(Collections.reverseOrder()); // 내림차순으로 자동 정렬
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++ ){
                for(int s = j+1 ; s < n ; s++) {
                    int temp = arr[i] + arr[j] +arr[s];
                    answers.add(temp);
                    temp = 0;
                }
            }
        }

        int answer = -1;
        int count = 0;
        for(int x : answers) {
            if(count == k-1) {
                answer = x;
                break;
            }else count++;
        }

        System.out.println(answer);
    }
}
