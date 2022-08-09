package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] isPrime = new int[n+1];

        // 소수는 0, 소수가 아니면 1
        // 0과 1은 소수가 아니므로 1로 초기화
        isPrime[0] = isPrime[1] = 1;


        for(int i = 2 ; i < n ; i++) {
            // i번째 수가 소수이면
            if(isPrime[i] == 0) {
                // i의 배수들은 모두 소수가 아니다.
                for(int j = i+i ; j <= n ; j = j+i) {
                    isPrime[j] = 1;
                }
            }
        }

        int result = 0;
        for(int x : isPrime){
            if(x == 0) result++;
        }
        System.out.println(result);

    }
}
