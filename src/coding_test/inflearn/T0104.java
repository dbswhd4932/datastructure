package coding_test.inflearn;

import java.util.Scanner;

public class T0104 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            String input = in.next();
            // StringBuilder의 reverse 메서드 사용
            String result = new StringBuilder(input).reverse().toString();

            System.out.println(result);
        }
    }
}
