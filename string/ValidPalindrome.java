package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//유효한 팰린드롬
public class ValidPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 특수문자 제거 후 String 입력 받아 저장
        String str = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");

        // tmp 파일에 str 역순으로 저장
        String tmp = new StringBuilder(str).reverse().toString();

        // str과 tmp가 같을 경우 YES 출력력
        String answer = "NO";
        if(str.equals(tmp)) answer = "YES";

        System.out.println(answer);


    }
}