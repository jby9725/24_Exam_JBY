package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
        // 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다.
        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int line = 0; line < n; line++) {
            for (int i = 0; i < line; i++) {
                System.out.print(" ");
            }
            for(int j = n-line; j > 0; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}