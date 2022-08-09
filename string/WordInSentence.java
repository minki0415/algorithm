package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordInSentence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] words = str.split(" ");

        String answer = "";
        for(String x : words) {
            if(x.length() > answer.length()) answer = x;
        }

        System.out.println(answer);

    }
}
