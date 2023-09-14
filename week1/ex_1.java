package week1;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 입력받아 평균을 출력하는 프로그램
public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력

        System.out.println("국어 점수를 입력하세요: ");
        int Kor = scanner.nextInt(); // 사용자 입력

        System.out.println("영어 점수를 입력하세요: ");
        int Eng = scanner.nextInt(); // 사용자 입력

        System.out.println("수학 점수를 입력하세요: ");
        int Math = scanner.nextInt(); // 사용자 입력

        System.out.println("세 과목의 평균은 "+(Kor+Eng+Math)/3+"점 입니다."); // 평균 출력
    }
}
