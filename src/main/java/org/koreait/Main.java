package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 3. 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다. 수열을 생성하기 위해 루프를 사용합니다.

        int level = 10;
        int first_number = 0;
        int second_number = 1;
        int temp = 0;

        for (int i = 0; i < level - 1; i++) {
            if (i == 0) {
                System.out.printf("%d %d ", first_number, second_number);
            } else {
                temp = first_number + second_number;
                first_number = second_number;
                second_number = temp;
                System.out.print(temp + " ");
            }
        }

//        // 2. 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
//        // 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다.
//        int n;
//        Scanner input = new Scanner(System.in);
//
//        n = input.nextInt();
//
//        for (int line = 0; line < n; line++) {
//            for (int i = 0; i < line; i++) {
//                System.out.print(" ");
//            }
//            for(int j = n-line; j > 0; j--) {
//                System.out.printf("%d ", j);
//            }
//            System.out.println();
//        }

//        // 1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다
//        int x;
//        int y;
//
//        Scanner input = new Scanner(System.in);
//
//        x = input.nextInt();
//        y = input.nextInt();
//
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < x; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}