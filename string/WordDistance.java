package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        String str = strs[0];
        char c = strs[1].charAt(0);

        int p = 1000;
        int[] answer = new int[str.length()];
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p += 1;
                answer[i] =p;
            }
        }

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(str.length()-i-1) == c) {
                p = 0;
                if(answer[str.length()-i-1] > p) answer[str.length()-i-1] = p;
            }else {
                p += 1;
                if(answer[str.length()-i-1] > p) answer[str.length()-i-1] = p;
            }
        }

        for(int x : answer) {
            System.out.print(x + " ");
        }

    }
}