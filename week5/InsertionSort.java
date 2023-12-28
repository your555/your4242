package week5;

/* 소팅 알고리즘을 Java 코드로 구현하고 설명할 수 있도록 숙제
ArrayList에 임의의 1~10 정수값을 5개를 만들어 담고 정렬하는 코드 - 삽입 정렬

소팅 알고리즘(sorting algorithm)이란 원소들을 번호순이나 사전 순서와 같이 일정한 순서대로 열거하는 알고리즘이다.

삽입 정렬(Insertion Sort): 정렬 범위를 1칸씩 확장해나가면서 새롭게 정렬 범위에 들어온 값을 기존 값들과 비교하여 알맞은 자리에 꼽아주는 알고리즘
    특징: 선택/거품 정렬은 패스가 거듭될 수록 탐색 범위가 줄어드는 반면에 삽입 정렬은 오히려 점점 정렬 범위가 넚어진다.
         큰 크림에서 보았을 때 바깥 쪽 루프는 순방향, 안쪽 루프는 역방향으로 진행하고 있다.
         이 알고리즘은 특성상, 기준의 왼쪽 값들은 모두 정렬이 되어있다
   순서: 1.현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
        2.타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
        3.그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
 */

import java.util.ArrayList;
import java.util.Random;


public class InsertionSort {
    public static void main(String[] args) {  //메인 메서드
        ArrayList<Integer> a = new ArrayList<Integer>();  //리스트 a 생성
        Random rand = new Random(); //난수 발생 전용 객체 선언

        for (int i = 0; i < 4; i++) {  //5번 반복을 통해 5개의 난수를 리스트 a에 저장
            int n = (int) (Math.random() * 10) + 1; //1~10까지의 무작위 정수 한개 발생
            a.add(n); //배열에 저장
        }
        System.out.println(a); //정렬되기 전의 배열 출력


        for (int i=1; i<a.size(); i++) { //비교의 기준은 무조건 배열의 2번째 숫자부터. 왼쪽의 숫자와 비교함. -> int i=1;
        int standard = a.get(i);  // "기준"이 되는 2번째 숫자 = standard
        int aux = i - 1;   // "비교 대상"인 2번째 숫자 왼쪽에 있는 1번째 숫자 = aux

        while (aux >= 0 && standard < a.get(aux)) { //비교대상이 0보다 크거나 같고, 기준보다 작을 때
            a.set(aux + 1, a.get(aux));   // 비교대상이 큰 경우 오른쪽(aux + 1)으로 밀어냄
            aux--;
        }

        a.set(aux + 1, standard);  // 기준값 저장
    }
    System.out.println(a); //정렬된 배열 출력
}


    }
