package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//public class IronStick {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//
//        int temp = 0; // 놓여있는 쇠막대기의 개수
//        int answer = 0; // 잘려진 쇠막대기의 개수
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < str.length(); i++) {
//            if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
//                answer += temp;
//                i++;
//            }
//            else if(str.charAt(i) == '(') temp += 1;
//            else {
//                temp -= 1;
//                answer += 1;
//            }
//        }
//
//        System.out.println(answer);
//
//
//    }
//}

public class IronStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }
        System.out.println(answer);
    }
}
