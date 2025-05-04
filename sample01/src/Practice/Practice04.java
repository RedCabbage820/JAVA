package Practice;

import java.util.Random;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// 가위 바위 보 프로그램을 구현합니다.
		// 사용자는 1(가위) 2(바위) 3(보)에 대한 입력을 진행할 수 있습니다.
		// 상대방(AI)는 1, 2, 3 중 하나를 랜덤으로 냅니다.
		// 판은 총 10판을 진행할 수 있으며 판 당 승, 패, 무가 저장됩니다.
		// 게임이 종료되면 승, 패, 무를 출력하고 획득한 점수를 출력합니다.
		// 점수는 승리시 2점 패배 시 -1점 무승부 시 0점을 획득합니다.
		
		//힌트)Practice02 파일의 랜덤 기능을 참고해보세요.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int AI_select = rd.nextInt(3) + 1;
		
		int score = 0;
		int AI_score = 0;
		int i = 0;
		
		int whatt = 0;
		int winning = 0;
		int lose = 0;
		int drawing = 0;
		
		while(i != 10)
		{
			i += 1;
			System.out.printf("제 %d번째 게임\n", i);
			System.out.println("1.가위 2.바위 3.보");
			int RSP = sc.nextInt();
			if(RSP == 1)
			{
				if(AI_select == 1)
				{
					score += 0;
					AI_score += 0;
					System.out.println("비겼다");
					drawing++;
				}
				else if(AI_select == 3)
				{
					score += 2;
					AI_score -= 1;
					System.out.println("가위로 보자기를 이겼다");
					winning++;
				}
				else if(AI_select == 2)
				{
					score -= 1;
					AI_score += 2;
					System.out.println("가위로 바위에게 졌다");
					lose++;
				}
			}
			else if(RSP == 2)
			{
				if(AI_select == 3)
				{
					score -= 1;
					AI_score += 2;
					System.out.println("바위로 보자기에게 졌다");
					lose++;
				}
				else if(AI_select == 2)
				{
					score += 0;
					AI_score += 0;
					System.out.println("비겼다");
					drawing++;
				}
				else if(AI_select == 1)
				{
					score += 2;
					AI_score -= 1;
					System.out.println("바위로 가위를 이겼다");
					winning++;
				}
			}
			else if(RSP == 3)
			{
				if(AI_select == 2)
				{
					score += 2;
					AI_score -= 1;
					System.out.println("보자기로 바위를 이겼다");
					winning++;
				}
				else if(AI_select == 1)
				{
					score -= 1;
					AI_score += 2;
					System.out.println("보자기로 가위에게 졌다");
					lose++;
				}
				else if(RSP == 3)
				{
					score += 0;
					AI_score += 0;
					System.out.println("비겼다");
					drawing++;
				}
			}
			else if(RSP > 3)
			{
				System.out.println("반칙");
				score -= 1;
				AI_score += 1;
				whatt += 1;
			}
			else if(RSP < 1)
			{
				System.out.println("반칙");
				score -= 1;
				AI_score += 1;
				whatt += 1;
			}
		}
		System.out.println("종료");
		System.out.printf("너는 %d번 이겼었고,\n", winning);
		System.out.printf("%d번 졌었으며,\n", lose);
		System.out.printf("%d번 비겼었다.\n", drawing);
		System.out.printf("....그리고 너는\n");
		if(whatt == 0)
		{
			System.out.printf("반칙을 아예 하지 않는 성실한 태도를 보였다.\n");
		}
		else if(whatt < 2)
		{
			System.out.printf("반칙을 %d번 밖에 안한 조금은 성실한 태도를 보였다.\n", whatt);
		}
		else if(whatt < 4)
		{
			System.out.printf("%d번 정도 반칙을 한 조금은 불성실한 태도를 보였다.\n", whatt);
		}
		else if(whatt < 8)
		{
			System.out.printf("반칙을 %d번 씩이나 한 조금은 불성실한 태도를 보였다.\n", whatt);
		}
		else if(whatt >= 8)
		{
			System.out.printf("모든 승부에서 반칙을 사용했다.\n");
		}
		System.out.printf("너의 총점은 %d점이며,\n", score);
		System.out.printf("나의 총점은 %d점이다.\n", AI_score);
		if(score == AI_score)
		{
			System.out.println("좋은 승부였다 인간.");
		}
		else if(score > AI_score)
		{
			System.out.println("너가 이겼다 인간. ㄲㅂ");
		}
		else if(score < AI_score)
		{
			System.out.println("인간 시대의 끝이 도래했다.");
		}
		sc.close();
	}
}