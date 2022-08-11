package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Stack
//public class CorrectParenthesis {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String answer = "YES";
//        Stack<Character> temp = new Stack<>();
//        for(char x : str.toCharArray()) {
//            if(x == '(') temp.add(x);
//            else {
//                if(temp.size() == 0) {
//                    answer = "NO";
//                    break;
//                }
//                temp.pop();
//            }
//        }
//        if(temp.size() > 0) {
//            answer = "NO";
//        }
//        System.out.println(answer);
//    }
//}

public class CorrectParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) {
                    answer ="NO";
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer ="NO";

        System.out.println(answer);

    }
}
