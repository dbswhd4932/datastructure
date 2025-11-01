package coding_test.inflearn;

import java.util.Scanner;

public class T0101 {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            if (t == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        T0101 T = new T0101();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
