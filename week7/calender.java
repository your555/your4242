package week7;
// 연도 입력시 달력이 윤년에 맞게 출력되도록 하시오.
import java.util.Scanner;
public class calender {

    public static boolean leapyear(int year) //윤년을 판정하는 함수
    {
        if ( (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0) )
            return true;
        else
            return false;
    }


    public static int[] computeyoil(int year) //year해의 12달 각 요일을 숫자로 계산해서 배열 반환
    {
        int yoil[] = new int[12];
        yoil[0] = 1;//1년 1월1일 은 월요일

        for (int i = 1; i < year; i++) //i=1,2,3,4,.....year-1
        {
            if (leapyear(i))
                yoil[0] +=2;
            else
                yoil[0] +=1;
        }
        yoil[0] %= 7;//1월1일 요일
        yoil[1] = (yoil[0] + 31) % 7; //2월1일 요일

        if (leapyear(year)) //윤년일 경우 2월달이 29일
            yoil[2] = (yoil[1] + 29) % 7; //3월1일 요일
        else
            yoil[2] = (yoil[1] + 28) % 7; //3월1일 요일

        yoil[3] = (yoil[2] + 31) % 7; //4월1일 요일
        yoil[4] = (yoil[3] + 30) % 7; //5월1일 요일
        yoil[5] = (yoil[4] + 31) % 7; //6월1일 요일
        yoil[6] = (yoil[5] + 30) % 7; //7월1일 요일
        yoil[7] = (yoil[6] + 31) % 7; //8월1일 요일
        yoil[8] = (yoil[7] + 31) % 7; //9월1일 요일
        yoil[9] = (yoil[8] + 30) % 7; //10월1일 요일
        yoil[10] = (yoil[9] + 31) % 7; //11월1일 요일
        yoil[11] = (yoil[10] + 30) % 7; //12월1일 요일

        return yoil;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("년도 입력>>");

        int year = in.nextInt();

        if (leapyear(year))
            System.out.println(year + "년은 윤년입니다.");
        else
            System.out.println(year + "년은 윤년이 아닙니다.");

        in.close();
    }


    public static void printCalendar(int year, int yoil[])
    {
        int monthDays [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (leapyear(year))
            monthDays[1] = 29;

        System.out.println("=================== CALENDAR "+year+" ==================");

        for(int month = 0; month < 12; month++)
        {
            System.out.println("           MONTH "+(month+1));
            System.out.println(" SUN MON TUE WED THU FRI SAT");
            int day = 1;

            for (int row = 0; row < 6; row++) //달력은 최대 6줄 출력
            {
                for (int col = 0; col < 7; col++) //1줄에 7일씩
                {
                    if (yoil[month]-- > 0) //yoil : SUN0 MON1 TUE2 WED3 THU4 FRI5 SAT6
                        System.out.print("    ");
                    else
                    {
                        if (day <= monthDays[month])
                            System.out.printf("%4d", day++); //일 출력
                        else
                            System.out.print("    ");
                    }
                }
                System.out.println();
            }
        }
    }
}
