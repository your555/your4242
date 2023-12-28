package ASAP;

//2023/11/10목/금
//A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다.
// A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
//A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램

public class TurnSpace {
    public static void main(String[] args){
        try{
            String tab = "테스트   입니다 ";

            tab = tab.replace("\t", "    ");

            char[] ch = tab.toCharArray();
            for(int i=0; i<ch.length; i++){
                System.out.print( i + " " + " :: ==> " + (int)ch[i] + "\t" + " || ");
                System.out.print( i + " " + " :: ==> " + ch[i] );
                System.out.println("");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
