//윤아 문제

//윤아는 기말고사를 망쳤다.그래서 점수를 조작하여 집에 가져가기로 결심했다.
//일단 윤아는 자기 점수 중 최댓값(M)을 고르고 최댓값을 M이라 했을 때 모든 점수를 "점수/M*100"으로 고쳤다,
//예를 들어 윤아의 최고점이 70점, 수학점수가 50점이라면 조작한 수학점수는 50/70*100이므로 71.43점이다.
//윤아의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램 만들기

//주석에 표시되어있는 내용을 참조하여 문제라고 적힌 빈 부분을 채워 넣으시고 오류를 수정해주세요!(총 4문제)

//조건

//1.시험을 본 과목의 개수 N이 주어진다. 해당 값은 1000보다 작거나 같다.
//2.윤아의 현재 성적이 주어진다.해당 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 1개의 값은 0보다 커야한다.

package week1.other;
import java.util.Scanner;

public class Score_Manipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("과목의 개수를 입력하세요:");
		int N =sc.nextInt(); //시험을 본 과목의 개수
		
		System.out.println("조작 전 과목별 성적들을 입력하세요:");
		int[] array = new int[N]; //[문제1]윤아의 과목별 성적을 담기 위해 배열 array선언하기
		
		for(int i=0; i<array.length; i++) {    //인덱스는 0번째 부터
			array[i]= sc.nextInt();            //각 인덱스에 들어갈 점수를 콘솔에 입력해야함
			
			//반복문을 통해 조건문이 끝날 때 까지 인덱스 생성하기
		}
		
		long sum=0; //평균을 구하기 위해서는 for문을 사용하여 점수를 다 더해야해서 sum을 0으로 초기화함
		long Max=0; //최댓값은 for문을 이용하여 인덱스끼리 비교해야하므로 0으로 초기화함
		
		for(int i=0; i<array.length; i++) {

			if(Max < array[i]) {  //[문제2]조건문을을 활용해 인덱스끼리 비교하여 Max값을 구하는 코드 작성하기
				Max = array[i]; }


			//만약 N이 3이고 각 과목의 점수를 array에 40,80,60으로 저장했다면
			//array[0]=40; array[1]=80; array[2]=60;이 됩니다.
			//여기서 각각 인덱스끼리 비교해 나가는 걸 생각해보면 문제가 풀릴 것 입니다.
			
			//ex) array[0]=40>Max이므로(현재 Max값은 0으로 초기화) 현재까지는array[0]이 최댓값 
			//그 다음으로는 현재 Max값인 array[0]과 array[1]인덱스를 비교하여 더 큰 값을 Max로 지정하면 됩니다.



			sum+=array[i];

			//[문제3]새로운 평균을 구할 때 사용할 조작된 점수들의 총합(sum)을 구하는 코드 작성하기
		   //배열의 길이가 끝날 때 까지 반복하여 더하며 처음 우리가 sum을 0으로 초기화했던 것을 기억하고 풀면 됩니다.
		
		}

		//[문제4]조작된 점수들의 평균을 구하는 코드를 간단하게 작성하기
		System.out.println("조작된 점수의 평균은 "+(sum/Max)*100/N);
	 
		  //문제에서 제시한 한 과목의 점수를 계산하는 식은 통합과 관련된 식으로 바꿀 수 있습니다. 
		 //따라서 일일이 변환점수를 구할 필요없이 한번에 변환한 점수의 평균 점수를 구할 수 있다.이걸 생각하면 [문제4]도 쉽게 해결할 수 있을 것입니다.
		
		}	
      }
    
  
