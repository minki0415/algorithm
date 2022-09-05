package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 특정문자뒤집기
public class SpecificWordConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();

        // lt와 rt가 같을 때 lt의 값을 temp에 담아두고 두 값 교환하여 저장
        // 저장 후 lt++, rt--
        int lt = 0;
        int rt = str.length()-1;
        while(lt < rt) {
            if(Character.isLetter(arr[lt]) && Character.isLetter(arr[rt])) {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            } else if(!Character.isLetter(arr[lt])) {
                lt++;
            } else rt--;
        }

        System.out.println(arr);
    }
}
