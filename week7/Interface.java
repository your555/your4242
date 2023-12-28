package week7;
//인터페이스 예제

interface ResCustomer {
    String getOrder();
}

// 단골손님 A와 B 클래스에서 인터페이스 ResCustomer의 getOrder 추상 메서드 구현
class ResCustomerA implements ResCustomer {
    public String getOrder() {
        return "손님 A에게 김치찌개를 준다";
    }
}

class ResCustomerB implements ResCustomer {
    public String getOrder() {
        return "손님 B에게 제육볶음을 준다";
    }
}

// 식당 사장
class ResOwner {
    public void giveFood(ResCustomer resCustomer) {
        System.out.println(resCustomer.getOrder());
    }
}

// 음식 주문
public class Interface {
    public static void main(String[] args) {
        ResOwner owner = new ResOwner();
        ResCustomerA a = new ResCustomerA();
        ResCustomerB b = new ResCustomerB();

        owner.giveFood(a);
        owner.giveFood(b);
    }
}
