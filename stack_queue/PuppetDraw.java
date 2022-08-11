package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class PuppetDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                board[j][i] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0 ; i < m ; i++) {
            moves[i] = sc.nextInt() - 1;
        }

        int answer = 0;
        Stack<Integer> result = new Stack<>();
        for(int x : moves) {
            for(int i = 0 ; i < n ; i++) {
                if(board[x][i] != 0) {
                    if(!result.isEmpty() && result.peek() == board[x][i]){
                        answer += 2;
                        result.pop();
                        board[x][i] = 0;
                        break;
                    }else {
                        result.add(board[x][i]);
                        board[x][i] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
