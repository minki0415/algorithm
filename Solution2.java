import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {

    public static String[] solution(String[] languages, int[][] scores) {
        String[] answer = new String[scores[0].length];

        HashMap<String, Integer> map = new HashMap<>();
        map.put("C", 0);
        map.put("SWIFT", 1);
        map.put("JAVA", 2);
        map.put("R", 3);

        HashMap<String, Integer> langCount = new HashMap<>();
        for(String x : languages) {
            langCount.put(x, langCount.getOrDefault(x, 0) + 1);
        }

        System.out.println(langCount.toString());

        // C, SWIFT, JAVA, R
        // 4 x 3 배열 생성, 언어별 총점 더하기
        double[][] total = new double[4][scores[0].length] ;

        for(int i = 0 ; i < languages.length; i++) {
            for(int j = 0 ; j < scores[i].length; j++) {
                total[map.get(languages[i])][j] += scores[i][j];
            }
        }

        String[] temp = {"C", "SWIFT", "JAVA", "R"};
        for(int i = 0 ; i < 4; i++) {
            for(int j = 0 ; j < scores[i].length; j++) {
                total[i][j] = total[i][j] / langCount.get(temp[i]);
            }
        }

        for(int i = 0 ; i < total.length ; i++) {
            for(int j = 0 ; j < total[i].length ; j++){

            }
        }

        System.out.println(Arrays.deepToString(total));

        return answer;
    }

    public static void main(String[] args) {

        String[] languages = {"C", "SWIFT", "JAVA", "SWIFT", "JAVA", "JAVA", "R"};
        int[][] scores = {{65,80,90},{46,100,70} ,{91,96,59}, {89,90,61}, {0, 94, 75}, {38, 95, 47}, {50,60,90}};

        System.out.println(solution(languages, scores));
    }

}
