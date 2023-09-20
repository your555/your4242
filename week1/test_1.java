package week1;

import java.util.Scanner;

// Scanner 문제
// 표준입력으로 임의의 문자열을 입력받고 그 문자열에서 숫자만 골라 출력하는 프로그램 만들기

public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 표준입력

        System.out.println("문자열을 입력하세요: ");
        String st = scanner.nextLine(); // 임의의 문자열 입력받기

        System.out.println("이 문자열에 포함된 숫자는 ");
        for (int i=0; i<st.length(); i++) { // 문자열의 길이만큼 반복
            char c = st.charAt(i); // String 타입의 문자열을 char 타입으로 한 글자만 받기
            if (Character.isDigit(c)) {
                // c가 숫자 데이터라면 (isDigit() 자체가 함수-전화번호에 -말고 숫자만 입력받고 싶을 때)
                System.out.println(c);
            }
        }
    }
}
// if (Character.isDigit(c)==false) {} 혹은 else 문 혹은 if (!Character.isDigit(c))