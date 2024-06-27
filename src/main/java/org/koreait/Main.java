package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        for(int i = 0; i<y; i++)
        {
            for(int j = 0; j<x; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}