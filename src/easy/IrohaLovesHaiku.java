package easy;

import java.util.Scanner;

public class IrohaLovesHaiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a == 5 || a == 7) && (b == 5 || b == 7) && (c == 5 || c == 7) && (a + b + c == 17)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}