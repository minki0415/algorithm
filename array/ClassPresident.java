package array;

import java.util.Scanner;

public class ClassPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grade = 5;
        int[][] arr = new int[n][grade];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < grade ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) { //i번 학생이
            int cnt = 0;
            for(int j = 0 ; j < n ; j++) { //j 학년일때
                for(int k = 0; k < grade ; k++) {
                    if(arr[i][k] == arr[j][k]){ //j번 학생 k 학
                        cnt++;
                        System.out.println("i : "+ i +" /k : "+ k +" /j : "+ j +" /k : "+ k);
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }
        System.out.println(answer);


        sc.close();
    }
}