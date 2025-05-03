package Practice;

import java.util.Random; //값을 임의로 설정할 수 있도록 도와주는 도구
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int rd_value = rd.nextInt(10); //rd.nextInt(정수); 0부터 정수 -1까지의 범위 중 하나가 랜덤 값 설정
		//System.out.println(rd_value);
		
		int mat_value = (int)(Math.random() * 10);
		//Math.random()은 Math 클래스에서 제공해주는 랜덤을 뽑는 문법입니다.
		//별도의 import를 요구하지 않습니다.
		//(int)(Math.random() * 정수);를 적으면 0부터 정수 -1 까지의 범위를 가지게 됩니다.
		System.out.println(mat_value);
		
		//범위는 1 ~ 100까지로 설정합니다.
		//랜덤 기능을 이용해서 정답 숫자를 1개 설정합니다.
		//사용자는 숫자 입력을 통해 정답을 맞춥니다.
		//입력한 값이 정답보다 값이 작다면 UP, 크다면 DOWN을 출력합니다.
		//정답인 경우라면 정답이 출력됩니다.
		
		Random JD = new Random();
		int JD_value = JD.nextInt(100) + 1;
		
		//System.out.println("현재 정답 : " + JD_value); //테스트용 코드(로직 확인되면 삭제)
		System.out.println("당신이 생각한 정답을 입력해보시오. 1~100까지의 값 중 단 1개만이 정답입니다.");
		int iDab = sc.nextInt();
		
		if(JD_value == iDab)
		{
			System.out.printf("당신이 고른 %d는 정답입니다.", iDab);
		}
		else if(JD_value > iDab)
		{
			System.out.println("UP\n");
			System.out.printf("정답은 %d입니다.", JD_value);
		}
		else if(JD_value < iDab)
		{
			System.out.println("DOWN\n");
			System.out.printf("정답은 %d입니다.", JD_value);
		}
		else
		{
			System.out.println("당신은 숫자만을 입력할 수 있습니다.\n");
			System.out.printf("정답은 %d입니다.", JD_value);
		}
		
		sc.close();
	}

}