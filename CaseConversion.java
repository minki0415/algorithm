import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder answer = new StringBuilder();

        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) answer.append(Character.toLowerCase(x));
            else answer.append(Character.toUpperCase(x));
        }

        System.out.println(answer);
    }
}
