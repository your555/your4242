package week3;

import java.util.HashMap;
import java.util.Scanner;

public class ex_1_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("모스부호를 입력하세요 : ");
        String[] input1 = scanner.nextLine().split(" ");
        // 입력값을 input1이라는 문자열 배열에 저장.
        // split() 함수 = 문자열을 각각 문자별로 잘라서 배열에 저장하여 리턴.

        HashMap<String , Character> map = new HashMap<String , Character>();
        // 모스부호(key)는 String, 알파벳(val)은 Charater로 구성된 해시맵 생성
        String [] key = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};
        char [] val = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        for(int i=0; i<key.length; i++) { //[문제1]모스부호의 길이 만큼 key와 val에 저장하는 for문을 완성하세요.
            map.put(key[i], val[i]);
        }

        for(int i=0; i<input1.length; i++){ // 입력받은 길이만큼 반복
            if(map.get(input1[i]) == null) // 만약 입력값이 null이라면
                System.out.print(" "); // 공백 출력
            else // 그렇지 않다면
                System.out.print(map.get(input1[i])); // 입력값에 해당하는 키를 전달하여 얻은 값 출력
        }
    }
}

//모스부호를 입력하세요 : .. .- -- -... .- -... ---
//iambabo
//모스부호를 입력하세요 : .. null .- -- null -... .- -... ---
//i am babo
