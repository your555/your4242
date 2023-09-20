package week1;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력하세요: ");
        double h = scanner.nextInt();

        System.out.println("삼각형의 너비를 입력하세요: ");
        double w = scanner.nextInt();

        System.out.println("삼각형의 넓이는: "+h*w/2);
    }
}
