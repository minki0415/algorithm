package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindUnion {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2]) p1++;
            else p2++;
        }


        return answer;
    }

    public static void main(String[] args) {

        FindUnion T = new FindUnion();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0 ; i < n ; i++) arr1[i] = sc.nextInt();


        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0 ; i < m ; i++) arr2[i] = sc.nextInt();


        // 1 2 3 5 9
        // 2 3 5 7 8
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        for(int x : solution(n, m, arr1, arr2)) System.out.print(x + " ");
    }
}
