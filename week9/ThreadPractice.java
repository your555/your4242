package week9;

/*동물원에 동물 4마리가 있다.
각 동물은 울음소리가 다르고 3마리의 동물은 동시에 운다.
나머지 1마리 동물은 3마리 동물이 모두 울고 나서 마지막에 운다.
Runnable 인터페이스로 멀티쓰레드를 구현하고 반드시 join()을 사용한다.
(각 동물은 10번씩만 운다.)
*/
/*실행결과:
애옹
어흥
멍멍
어흥
애옹
멍멍
어흥
애옹
멍멍
어흥
애옹
멍멍
애옹
멍멍
어흥
애옹
멍멍
어흥
애옹
어흥
멍멍
애옹
멍멍
어흥
멍멍
애옹
어흥
애옹
어흥
멍멍
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀
꿀꿀*/

class Animals extends Thread { //Thread 상속
    private String sounds; //동물의 울음소리를 저장할 String 타입 변수 sounds
    public Animals(String sounds) { //생성자
        super();
        this.sounds = sounds;
    }

    public void run() {
        printSound(500); //[문제1]0.5초 단위로 실행
    }
    //동물 울음소리 출력 메소드
    private void printSound(long millis) {
        for(int i=0; i<10; i++) { //10번 반복
            System.out.println(sounds); //동물 울음소리 출력
            try {
                Thread.sleep((millis));
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args) {
        //Animals 객체 세개 생성(동물 세마리 생성)
        Animals cat = new Animals("애옹");
        Animals dog = new Animals("멍멍");
        Animals pig = new Animals("꿀꿀");
        Animals lion = new Animals("어흥");

        cat.start();
        dog.start();
        lion.start();
        //join으로 우선순위를 주어서 두마리의 울음소리가 끝난 후 한마리 실행되게 함
        try{
            cat.join();
            dog.join();
            lion.join();
        }catch (InterruptedException e){;}
        pig.start();
    }
}