import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Password {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = str.substring(i * 7, (i+1)*7);
        }

        int[] intArr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            int temp = 0;
            for(int j = 0 ; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == '#') {
                    temp += Math.pow(2, arr[i].length() - j - 1);
                }
            }
            intArr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(intArr));

        for(int x : intArr) {
            System.out.print((char) x);
        }

    }
}
