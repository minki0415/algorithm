import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecificWordConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;
        while(lt < rt) {
            if(Character.isLetter(arr[lt]) && Character.isLetter(arr[rt])) {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt++;
            } else if(!Character.isLetter(arr[lt])) {
                lt++;
            } else rt--;
        }

        System.out.println(arr);
    }
}
