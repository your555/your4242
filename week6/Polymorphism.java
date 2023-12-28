package week6;
//다형성 연습하기
public class Polymorphism {
    class exanimal {
        void eat(){
            System.out.println("먹는다!");
        }
        void howl(){
            System.out.println("운다");
        }
        void moving(){
            System.out.println("움직인다.");
        }
    }

    class dog extends exanimal{
        void age(){
            System.out.println("1살이다.");
        }
    }

    public class animals {
        public void animals(String[] args) {
            dog dg = new dog();
            dg.age();
            dg.eat();
            dg.howl();
            dg.moving();
        }
    }

}
