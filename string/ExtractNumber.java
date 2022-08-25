package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//숫자만 추출
public class ExtractNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ArrayList<Integer> arr = new ArrayList<>();

        // char 배열에서 숫자인거 출력하여 ArrayList에 추가
        // 추가할때 char을 int로 변환해 주어야하므로 -48 연산 추가로 실행
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) arr.add((int)x - 48);
        }

        //배열에 저장되어 있는 각 숫자를 합하는 과정
        //앞의 배열 * 10^n 활용하여 자연수 형태로 변경
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