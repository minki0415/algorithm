package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class SumOfContinuousNumber2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int answer = 0, cnt = 1;
//        n--;
//        while(n > 0) {
//            cnt++;
//            n = n - cnt;
//            if(n%cnt == 0) answer++;
//        }
//
//        System.out.println(answer);
//
//    }
//}
public class SumOfContinuousNumber2 {
    public static int sumOfSequence(int n) {
        if(n <= 1) return n;
        else return sumOfSequence(n-1) + n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for(int i = 2 ; i < n/2+1 ; i++) {
            if(n - sumOfSequence(i) >= 0 && (n-sumOfSequence(i)) % i == 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
