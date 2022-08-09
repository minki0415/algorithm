package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockScissorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aTemp = br.readLine().split(" ");
        String[] bTemp = br.readLine().split(" ");

        int[] a = new int[aTemp.length];
        for(int i = 0 ; i < aTemp.length ; i++) {
            a[i] = Integer.parseInt(aTemp[i]);
        }

        int[] b = new int[bTemp.length];
        for(int i = 0 ; i < bTemp.length ; i++) {
            b[i] = Integer.parseInt(bTemp[i]);
        }

        // 1: 가위 , 2: 바위 , 3: 보
        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] == 2 && b[i] == 1) System.out.println("A");
            else if(a[i] == 3 && b[i] == 2) System.out.println("A");
            else if(a[i] == 1 && b[i] == 3) System.out.println("A");
            else if(a[i] == b[i]) System.out.println("D");
            else System.out.println("B");
        }

    }
}
