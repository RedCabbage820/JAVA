package MVC;
import javax.swing.JFrame;
import javax.swing.JTextField;

//JFrame은 창 기능
public class SwingDemo extends JFrame {

	//입력할 수 있는 텍스트 영역 컴포넌트
	JTextField jf_01 =new JTextField();
	JTextField jf_02 =new JTextField();
	
	// 앱 실행할 때 설정 넣는 곳
	SwingDemo()
	{
		//컴포넌트 추가(판 위에 깔아서 기능적으로 사용할 수 있는 도구
		//ex) 라디오 버튼, 입력 필드
		
		
		//0. 앱 이름 설정
		setTitle("번호 입력 프로그램");
		//1. 사이즈 설정
		setSize(300,200);
		//2. 종료 기능 추가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//2-1. 컴포넌트 연결
		jf_01.setBounds(50,50,100,40);
		jf_02.setBounds(100,100,100,40);
		
		//2-2. 프레임에 컴포넌트 등록
		add(jf_01);
		add(jf_02);
		
		//3. 앱 활성화
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingDemo(); //new는 생성 기능

	}

}