package test.study;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MyMain {
	public static void main(String[] args) {
		MyObject o1=new MyObject();
		o1.walk();
		int num=o1.getNumber();
		String greet=o1.getGreeting();
		/*
		 * 동일한 패키기 혹은 java.lang 패키지에 속한 클래스가 아니면 반드시 import 해야 사용할수 있다.
		 */
		Car car1=o1.getCar();
		car1.drive();
		
		//메소드를 호출하면서 적절한 type 데이터를 전잘해야 메소드를 호출할수 있다.
		o1.setNum(1000);
		int num1=999;
		//int type 데이터 들어 있는 변수명으로 데이터를 전달할수도 있다.
		o1.setNum(num1);
		
		o1.setName("유형우");
		String myName="주뎅이";
		o1.setName(myName);
		
		o1.useCar(new Car());
		Car car=new Car();
		o1.useCar(car);
		
		
		o1.useSome("유형우", car);
		o1.doSome(new Radio(), new Speaker());
		
		Radio r =new Radio();
		Speaker s =new Speaker();
		o1.doSome(r, s);
		
		
		
		
		
		
		
		
	}
}
