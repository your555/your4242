package week7;//버그 해결하기
//사용자로부터 숫자와 연산자를 입력받은 후 해당 연산자의 사칙 연산을 수행하는 프로그램입니다.

//버그 해결 전 결과
//첫 번째 숫자를 입력하세요>>3.5
//        연산자를 입력하세요(+, -, *, /)>>+
//        두 번째 숫자를 입력하세요>>2.5
//        결과>>3+2=5

//버그 해결 후 결과
//첫 번째 숫자를 입력하세요>>3.5
//        연산자를 입력하세요 (+, -, *, /)>>+
//        두 번째 숫자를 입력하세요>>2.5
//        결과>>3.5+2.5=6.0

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;

        System.out.print("첫 번째 숫자를 입력해주세요>>");
        int num1=(int)sc.nextDouble();

        System.out.print("연산자를 입력해주세요(+, -, *, /)>>");
        char operator=sc.next().charAt(0);

        System.out.print("두 번째 숫자를 입력해주세요>>");
        int num2=(int)sc.nextDouble();

        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if (num2==0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                    return;
                }
                result=num1/num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                return;
        }

        System.out.println("결과>>"+num1+operator+num2+"="+result);
    }
}
