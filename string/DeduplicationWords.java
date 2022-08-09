package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DeduplicationWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        LinkedHashSet<Character> answer = new LinkedHashSet<>();

        for(char x : str.toCharArray()) {
            answer.add(x);
        }

        Iterator<Character> iterSet = answer.iterator();
        while(iterSet.hasNext()) System.out.print(iterSet.next());

    }
}

//public class String.DeduplicationWords {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//        String answer = "";
//
//        for(int i = 0; i < str.length(); i++) {
//            if(str.indexOf(str.charAt(i)) == i) {
//                answer += str.charAt(i);
//            }
//        }
//        System.out.println(answer);
//    }
//}
