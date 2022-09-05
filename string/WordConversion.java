package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어뒤집기
public class WordConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++) {
            words[i] = br.readLine();
        }

        for(String x : words){
            StringBuilder sb = new StringBuilder(x);
            System.out.println(sb.reverse());
        }

    }
}
