package ASAP;

//2023/11/9/목
//10 미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//1000 미만의 자연수에서 3,5의 배수의 총합을 구하라.

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        int sum = 0; //sum값 초기화
        for (int i = 1; i < 1000; i++) {
            if(i%3==0 || i%5==0) //3의 배수 "또는" 5의 배수. 둘 중 하나만 충족해도 ok
                sum += i; //sum=sum+1
        }
        System.out.println(sum);
    }
}