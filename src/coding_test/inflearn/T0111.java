package coding_test.inflearn;

import java.util.Scanner;

public class T0111 {

    public String solution(String str) {
        str = str + " "; // 공백과 비교하도록
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) ==  str.charAt(i + 1)) {
                count ++;
            } else {
                stringBuilder.append(str.charAt(i));
                if (count > 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        T0111 t = new T0111();
        System.out.println(t.solution(str));
    }

}
