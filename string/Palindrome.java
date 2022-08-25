package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//회문문자열
public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        // StringBuilder는 reverse() 함수를 사용하여 역순 출력이 가능하다.
        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseStr)) System.out.println("YES");
        else System.out.println("NO");

    }
}