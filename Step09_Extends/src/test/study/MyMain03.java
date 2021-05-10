package test.study;

import test.human.Blood;
import test.human.Men;
import test.human.Person;
import test.human.Woman;

public class MyMain03 {
	public static void main(String[] args) {
		
		// 프로그래밍의 목적이 걷는것이다 어떻게 하면 걸을 수 있을까?
		Person p1 = new Person(new Blood("rh+", "B"));
		p1.walk();
		p1.study();
		// 프로그래밍의 목적이 영화를 보는것이다! 어떻게 하면 될까?
		Men m1=new Men(new Blood("-","A"));
		m1.seeMovie();
		// 프로그래밍의 목적이 책을 읽는 것이다! 어떻게 하면 될까?
		Woman w1=new Woman(new Blood("-","A"));
		w1.reading();
		//부모의 메소드 호출하기
		w1.walk();
		w1.study();
		//다형성 확인하기
		Person w2=w1;
		Object W3=w1;
	}
}
