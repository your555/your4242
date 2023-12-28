package week6;
//추상 클래스 제제

//탈 것 클래스
abstract class Vehicle //추상클래스
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("속도를" + speed + "으로 변경했습니다.");
    }
    abstract void show(); //추상메서드
}

//자동차 클래스
class Car extends Vehicle //추상클래스 상속
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량번호" + num + ", 연료양" + gas + "인 자동차가 만들어졌습니다.");
    }

    public void show() //추상메서드 오버라이딩
    {
        System.out.println("차량번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
        System.out.println("속도는 " + speed + "입니다.");
    }
}

//비행기 클라스
class Plane extends Vehicle //추상클래스 상속
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("비행기 번호가" + flight + "인 비행기가 만들어졌습니다.");
    }

    public void show() //추상메서드 오버라이딩
    {
        System.out.println("비행기 번호는" + flight + "입니다.");
        System.out.println("속도는" + speed + "입니다.");
    }
}

 class Practice01 {

    public static void main(String[] args) {

        Vehicle[] v1 = new Vehicle[2]; //추상 클래스 배열 준비

        v1[0] = new Car(1234, 20.5);
        v1[0].setSpeed(60);

        v1[1] = new Plane(232);
        v1[1].setSpeed(500);

        for(int i=0; i<v1.length; i++)
        {
            v1[i].show();
        }

    }

}