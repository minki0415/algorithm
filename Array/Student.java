package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        int[] arr = new int[n];
        for(int i = 0 ; i < temp.length ; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        int max = 0;
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++) {
            if(max < arr[i]) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);
    }
}
