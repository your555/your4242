package week8;

//학생들의 평균점수를 구하고, 평균점수 보다 높은 학생의 수를 구하는 코드

//출력값:
//The average score is 83.0
//3 students scored above average.


import java.util.Arrays;

class Student { //학생 객체를 생성할 클래스 정의. 학생의 이름과 점수를 가지는 필드가 있다.
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StreamExAnswer {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 85),
                new Student("Bob", 70),
                new Student("Charlie", 90),
                new Student("David", 75),
                new Student("Eve", 95)
        }; //앞서 정의한 학생 클래스로 여러개의 학생 객체를 만들어 배열에 담는다.

        double average = Arrays.stream(students)
                .mapToInt(Student::getScore) //stream의 mapToInt() 메소드를 통해 학생들의 점수를 정수형으로 추출
                .average() //average() 메소드를 사용하여 평균을 계산하여 학생의 평균 점수를 나타내는 average 변수에 담는다.
                .orElse(Double.NaN);

        long countAboveAverage = Arrays.stream(students)
                .mapToInt(Student::getScore) //stream의 mapToInt() 메소드를 통해 학생들의 점수를 정수형으로 추출
                .filter(score -> score > average) //filter() 메소드를 통해 평균보다 높은 점수를 가진 학생의 수를 계산하여 countAboveAverage 변수에 담는다.
                .count();

        System.out.println("The average score is " + average);
        System.out.println(countAboveAverage + " students scored above average.");
    }
}
