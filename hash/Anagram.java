package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClassPresident2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character, Integer> vote = new HashMap<>();

        for(char x : str.toCharArray()) {
            vote.put(x, vote.getOrDefault(x, 0)+1);
        }

        char answer = ' ';
        int max = Integer.MIN_VALUE;
        for(char x : vote.keySet()) {
            if(vote.get(x) > max) {
                max = vote.get(x);
                answer = x;
            }
        }
        System.out.println(answer);

    }
}
