package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    static int[] fib;
    public static int fibonacci(int n) {
        if(fib[n] > 0) return fib[n]; // 메모이제이션 활용
        if(n == 1) return fib[n] = 1;
        else if(n == 2) return fib[n] = 1;
        else {
            return fib[n] = fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib = new int[n+1]; // 메모이제이션 기록
        fibonacci(n);
        for(int i = 1 ; i <= n ; i++) System.out.print(fib[i] + " ");
    }
}
