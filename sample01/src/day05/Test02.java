package day05;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static 키워드가 붙은 클래스는 클래스명();을 통해
		//인스턴스 생성 없이 호출리 가능합니다.
		Test01.method01();
		
		//static이 안붙은 메소드 사용 시에는 인스턴스 생성 후 사용
		Test01 test01 = new Test01();
		test01.method03();
	}
}