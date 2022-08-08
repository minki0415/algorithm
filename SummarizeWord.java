import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummarizeWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        // KKHSSSSSSSE
        // str.length() = 11

        int count = 0;
        int lt = 0, rt = 0;
        while(lt < str.length()) {
//            System.out.println("lt : " + lt + " / rt : " + rt);
            char temp = str.charAt(lt);
            if(lt == str.length() - 1) {
                sb.append(temp);
                if(count > 1) sb.append(count);
                break;
            }else if(rt == str.length() -1){
                sb.append(temp);
                count++;
                if(count > 1) sb.append(count);
                break;
            }else if(temp == str.charAt(rt)) {
                count++;
                rt++;
            }else if(temp != str.charAt(rt)) {
                sb.append(temp);
                if(count > 1) sb.append(count);
                count =0;
                lt = rt;
            }
        }

        System.out.println(sb.toString());


    }
}