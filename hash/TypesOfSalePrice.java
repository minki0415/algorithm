package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        HashMap<Character, Integer> arr1 = new HashMap<>();
        for(char x : str1. toCharArray()) {
            arr1.put(x, arr1.getOrDefault(x,0) + 1);
        }

        String str2 = br.readLine();
        for(char x : str2. toCharArray()) {
            arr1.put(x, arr1.getOrDefault(x,0) - 1);
        }

        String answer = "YES";
        for(char x : arr1.keySet()) {
            if(arr1.get(x) != 0) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
