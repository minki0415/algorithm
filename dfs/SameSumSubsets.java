package dfs;

import java.util.Scanner;

class SameSumSubsets {
    static String answer ="NO";
    static int n, total = 0;
    boolean flag = false;
    public  void dfs(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(L == n) {
            if((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }else {
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        SameSumSubsets s = new SameSumSubsets();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        s.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
