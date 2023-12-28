package week4;

/*
<상속을 활용하는 문제>
Beer클래스(부모클래스), Hoegaarden클래스(자식클래스)를 참고하여
HoegaardenBeerExample 클래스에서 빈칸을 채워 호가든 레몬맛의 맥주 마셔보기
*/

public class Beer {
    String type;
    String model;

    // 생성자(객체 값 세팅)
    public Beer(String type, String model) {
        this.type = type;
        this.model = model;
    }
    public void drink() {
        System.out.println("마십니다.");
    }
    public void mix() {
        System.out.println("섞습니다.");
    }
    public String getType() {
        return type;
    }
    public String getModel() {
        return model;
    }
}
class Hoegaarden extends week4.Beer {
    String flavor;
    int ABV = 6;

    // 생성자 입력
    Hoegaarden(String model, String flavor) {
        super("밀맥주", model);
        this.model = model; // model은 상위 Beer 클래스로부터 상속받음
        this.flavor = flavor;
        this.ABV = ABV;
    }

    // 메서드 입력
    public void flavordrink() {
        System.out.println(model + "맥주의 " + flavor + "맛을 마십니다.");
    }

    // Getter
    public String getFlavor() {
        return flavor;
    }
    public int getABV() {
        return ABV;
    }
}
class HoegaardenBeerExample {
    public static void main(String[] args) {
        // 호가든 맥주 레몬맛 객체 생성하기
        week4.Hoegaarden holemon = new week4.Hoegaarden("호가든", "레몬");

        // Beer 클래스로부터 상속받은 필드(2개)
        System.out.println("타입 : " + holemon.getType());
        System.out.println("알콜 도수 : " + holemon.getABV());

        // Hoegaarden 클래스로부터 상속받은 필드
        System.out.println("맛 : " + holemon.getFlavor());

        // Hoegaarden 클래스 메서드 호출
        holemon.flavordrink();
    }
}

/*
타입 : 밀맥주
알콜 도수 : 6
맛 : 레몬
호가든맥주의 레몬맛을 마십니다.
*/