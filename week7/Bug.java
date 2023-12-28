package week7;

/*
<버그 수정 문제>
파일을 읽어서 첫째줄의 글자수를 세는 프로그램입니다.
파일이 없는 경우에 프로그램이 정상적으로 실행되지 못합니다.
아래는 정상적으로 실행되저 않았을 때 “오류입니다. 파일이 없습니다”라는 메시지만을 출력해야합니다.

버그 있는 버전 출력 결과:
"오류입니다. 파일이 없습니다.
첫행 내용 :
글자수 : 0"

상위 호출한 메소드에서 예외처리를 하여 “오류입니다. 파일이 없습니다”만을 출력하도록 버그를 수정해 보세요.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bug {
    public static void main(String[] args) {
        String str = Bug.textRead("c:\\tmp\\a.txt");
        int wordCnt = Bug.textCount(str);
        System.out.println("첫행 내용 : " + str);
        System.out.println("글자수 : " + wordCnt);
    }

    public static String textRead(String location) {
        String firstLine = "";

        try {
            FileReader fr = new FileReader(location);
            BufferedReader br = new BufferedReader(fr);
            firstLine = br.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("오류입니다. 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("IO오류입니다.");
        }

        return firstLine;
    }

    public static int textCount(String firstLine){
        int count = firstLine.length();
        return count;
    }
}

/*
출력 결과:
오류입니다. 파일이 없습니다.
첫행 내용 :
글자수 : 0
*/
