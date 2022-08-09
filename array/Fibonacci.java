package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class Fibonacci {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int[] fib = new int[n];
//        for(int i = 0 ; i < fib.length ; i++) {
//            if(i == 0 || i == 1) fib[i] = 1;
//            else fib[i] = fib[i-1] + fib[i-2];
//        }
//
//        for(int x : fib) System.out.print(x + " ");
//    }
//}

public class Fibonacci {

    public static int fib(int n) {
        if(n <= 1) return n;
        else return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= n ; i++) {
            System.out.println(fib(i));
        }

    }
}
