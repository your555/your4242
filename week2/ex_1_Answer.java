package week2;

// 배열과 for 문을 이용하는 예제
// 사이사이 고양이 유치원 참치반 마릿수 "N"을 입력받고 마릿수 크기의 배열 "score"을 생성.
// 각 고양이의 수행평가 점수를 입력받고 점수 출력->총점 구하기->평균 구하기->총점, 평균 출력

import java.util.Scanner;

public class ex_1_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 인스턴스-객체 생성

        // 고양이 마릿수 입력받기
        System.out.print("사이사이 고양이 유치원 마릿수는? >> ");
        int N = scanner.nextInt(); // 고양이의 마릿수 입력받기

        // 마릿수 크기의 배열 score 생성
        int[] score = new int[N]; // 입력받은 마릿수 만큼의 배열 생성하기

        // 각 고양이마다 점수 입력
        for (int i=0; i<score.length; i++) {
            System.out.print(i+1+"번 고양이의 점수 입력 >> ");
            score[i] = scanner.nextInt();
        }

        // 총점, 평균 변수 생성
        int sum = 0;
        double ave = 0.0;

        // 각각의 고양이의 점수 출력
        System.out.println("\n** 참치반 고양이 점수 출력 **");
        for (int i=0; i<score.length; i++) {
            System.out.println(i+1+"번 고양이 점수: "+score[i]);
            sum += score[i]; // 참치반 총점 구하기
        }

        // 평균 구하기
        ave = (double) sum / N;

        // 출력
        System.out.println("참치반의 총점:"+sum+" 평균: "+ave);
    }
}
