import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseStr)) System.out.println("YES");
        else System.out.println("NO");

    }
}