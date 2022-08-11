package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Stack
public class Postfix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x - '0');
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if(x =='-') stack.push(lt-rt);
                else if(x =='*') stack.push(lt*rt);
                else if(x =='/') stack.push(lt/rt);
            }
        }

        System.out.println(stack.pop());

    }
}
