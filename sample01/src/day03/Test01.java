package day03;
//논리 연산 : 해당 식의 결과가 true 또는 false인지를 판단하는 연산입니다.
//(A,B는 특정 식을 의미합니다.)
import java.util.Scanner; //자바에서 입력을 진행하기 위해 사용할 도구

// A && B	AND 연산		두 항이 모두 true인 경우 true로 처리합니다.
// A || B	 OR 연산		두 항 중 하나라도 true인 경우 true로 처리합니다.
// A ^ B	XOR 연산		두 항이 서로 다른 경우 true로 처리합니다.
// !A		NOT 연산		항의 결과를 반대로 처리합니다.(true -> false / false -> true)

public class Test01 {

	public static void main(String[] args) {
		// 조건식 2개 이상 세우기(논리 연산자)
		
		//숫자 데이터 number에 대한 입력을 받고,
		//그 number가 1이상 100 이하인지 판단하는 프로그램 코드를 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요. : ");
		int number = sc.nextInt();
		//sc.nextInt()는 스캐너(sc)를 통해 정수형 데이터를 입력받는 기능입니다.
		//특정 데이터 형태가 정해져있는 입력일 경우, 형태에 맞지 않는 값을 입력 시에는 에러 발생(Input Mismatch)
		
		//1) boolean 타입 변수를 통해 조건식의 결과를 확인하는 방법
		boolean result = number >= 1 && number <= 100;
		System.out.println("해당 값은 1 이상 100 이하의 값이다. : " + result);
		
		sc.nextLine(); //문장 입력(남아있는 입력 키제거)
		//이 코드 작성 이유 : 위에서 입력한 값은 정수만 전달합니다.
		//그래서 다음 작업으로 넘기기 위한 키 (Enter)가 입력 임시 저장소(버퍼)에 남아있게 되고
		//아래의 코드처럼 문장을 입력받게되면, 그 키가 그대로 넘어가기 때문에 제거해줘야 합니다.
		
		System.out.println("서버에 접속을 시도하려면 Y 키를 입력해주세요 : ");
		char key = sc.nextLine().charAt(0);
		//sc.nextLine()은 문장을 입력할 때 사용합니다.
		//charAt(0)은 문장 중의 첫번째 단어 하나만 받아옵니다.
		
		//2) if문을 통한 조건문으로 결과를 확인하는 방법
		if(key == 'y' || key == 'Y') //키가 y이거나 Y인 경우
		{
			System.out.println("서버와의 연결을 시도합니다...");
		}
		else
		{
			System.out.println("서버와의 연결을 실패했습니다.");
		}
		
		sc.close(); //스캐너 사용 중단(더이상 스캐너의 사용이 필요 없을 경우)
	}

}