package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

// 중복문자 제거
public class DeduplicationWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //HashSet 생성 : 중복 제거하기 위해
        //LinkedHashSet : 삽입되는 순서 유지
        LinkedHashSet<Character> answer = new LinkedHashSet<>();

        // 주어진 String을 char 배열로 변환 후 한개 요소 씩 LinkedHashSet에 추가 -> 중복 제거, 순서 유지
        for(char x : str.toCharArray()) {
            answer.add(x);
        }

        //Iterator 활용하여 LinkedHashSet 요소 순서대로 출력
        Iterator<Character> iterSet = answer.iterator();
        while(iterSet.hasNext()) System.out.print(iterSet.next());

    }
}

//public class String.DeduplicationWords {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//        String answer = "";
//
//        for(int i = 0; i < str.length(); i++) {
//            if(str.indexOf(str.charAt(i)) == i) {
//                answer += str.charAt(i);
//            }
//        }
//        System.out.println(answer);
//    }
//}
