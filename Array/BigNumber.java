package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        int[] arr = new int[n];
        for(int i = 0 ; i < temp.length ; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        for(int i = 0 ; i < arr.length ; i++) {
            if(i == 0) System.out.print(arr[i] +" ");
            else if(arr[i] > arr[i-1]) System.out.print(arr[i]+ " ");
        }
    }
}
