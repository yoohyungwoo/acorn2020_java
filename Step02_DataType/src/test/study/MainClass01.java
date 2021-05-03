package test.study;

public class MainClass01 {
	// run 했을떄 실행순서가 시작되는 main 메소두
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int num1=10;
		num1=20;
		
		byte num2=10;
		num2=20;
		// int type 변수에 byte type 변수 안에 있는 값을 대입하기
		num1=num2;
		// byte type 변수에 int type 변수안에 있는 값 대입?
		//byte num3 = num1; //문법오류(compile 에러)
		
		// (byte) 는 형변환(casting) 연산자 이다.
		byte num3 = (byte)num1;
		
	}
}
