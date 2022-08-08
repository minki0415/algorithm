import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExtractNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ArrayList<Integer> arr = new ArrayList<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) arr.add((int)x -48);
        }

        int answer = 0;
        for(int i = 0 ; i < arr.size(); i++) {
            answer += arr.get(i) * Math.pow(10, arr.size()-i-1);
        }

        System.out.println(answer);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine().replaceAll("[^\\d]", "");
//        int answer = Integer.parseInt(str);
//        System.out.println(answer);
//    }
}