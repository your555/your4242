//빈 줄 채우기
//[문제 1] 사용자로부터 입력할 숫자의 개수를 입력받은 후
//[문제 2] 입력받은 숫자(개수) 만큼의 숫자를 저장할 배열(nubmer)을 생성하고
//[문제 3] 오름차순을 적용하여
//[문제 4] 출력하는 프로그램입니다.

//아래는 출력 결과의 예시입니다.
//입력할 숫자의 개수를 입력하세요.>>5
//        1번째 숫자>>5
//        2번째 숫자>>3
//        3번째 숫자>>9
//        4번째 숫자>>23
//        5번째 숫자>>1
//        오름차순 정렬이 적용된 배열은 1 3 5 9 23

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("입력할 숫자의 개수를 입력하세요.>>");
        int num=sc.nextInt();

        //[문제 1] 입력된 숫자(=정리할 숫자의 개수)만큼 배열을 생성하세요.
        int[] number = new int[num];

        //[문제 2] 사용자로부터 숫자를 입력받아 배열에 저장하는 부분입니다. 주석을 참고하여 빈 줄을 채워주세요.
        for (int x=0; x<num; x++) {
            System.out.println("배열에 들어갈 정수를 입력하세요.>>");
            number[x] = sc.nextInt();
        }

        //[문제 3] 배열 내 숫자들을 오름차순으로 정렬하는 부분입니다. 주석을 참고하여 빈 칸 또는 줄을 채워주세요.
        for(int i=0; i<number.length; i++){//배열의 i번째 숫자와 i+1번째 숫자를 비교하여가장 큰 숫자가 마지막 순서로 이동할 수 있도록 하는 부분입니다.
            for(int j=0; j< number.length; j++){ //배열의 j번째 숫자와 j+1번째 숫자를 비교하여 가장 큰 숫자가 마지막 순서로 이동할 수 있도록 하는 부분입니다.
                if (number[j]>number[j]+1){ //j번째의 숫자가 j+1째의 숫자보다 크다면
                    int temp=number[j]; //temp에 j번째 숫자를 저장한 후
                    number[j]=number[j+1]; //j번째 숫자에 j+1번째의 숫자 저장
                    number[j+1]=temp; //이후 temp에 저장해둔 (기존의)j번째 값을 j+1로 옮겨주기
                }
            }
        }

        System.out.print("오름차순 정렬이 적용된 배열은 ");
        //[문제 4] 오름차순이 적용된 배열을 출력해주세요.
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }
    }
