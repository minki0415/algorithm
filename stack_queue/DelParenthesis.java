package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DelParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        StringBuilder answer = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isLetter(x) && stack.isEmpty()) answer.append(x);
            else if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
        }

        System.out.println(answer);
    }
}
