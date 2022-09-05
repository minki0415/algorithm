package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryOutput {

    public static void recursive(int n) {
        if(n==0) return;
        else {
            recursive(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursive(n);
    }
}
