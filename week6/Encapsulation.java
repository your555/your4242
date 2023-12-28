package week6;
//캡슐화 예제
 class Person {

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(20);
        System.out.println(p1.getAge() + "살 입니다.");
    }
}
