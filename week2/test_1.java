package week2;

// 숫자를 입력받아 해당 층의 별표 탑 만들기

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("별표 탑의 층수를 입력하세요 >> ");
        int floor = scanner.nextInt();

        for (int i=0; i<floor+1; i++) {  // 입력받은 층수+1 만큼 별+줄바꿈 반복 (3을 입력하면 마지막이 3개인 탑 완성)
            for(int j=0; j<i; j++){      // 입력받은 층수+1 까지
                System.out.print("*");
            }
            System.out.println( );
        }


    }
}
