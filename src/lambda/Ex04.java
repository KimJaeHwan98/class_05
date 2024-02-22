	package lambda;

import java.util.Scanner;

interface Test04{
		public void test();
	}
	class TestClass04 {
		public void testClass(Test04 t) { //인터페이스 자료로 받아서 사용하겠습니다.
			System.out.println("기능 실행합니다!!!");
			t.test();
		}
	}
	public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		Test04 t04 = new Test04() {
			@Override
			public void test() {
			System.out.println("test실행합니다");
				
			}
		}; 
			t01.testClass(t04);
			
			t01.testClass(
					new Test04() {
						public void test() {
							System.out.println("test111실행됩니다.");
						}
					});
			
		/*
		Scanner input = new Scanner(System.in);
		String ss = input.next();
		System.out.println("ss : "+ss);
		System.out.println("input :" + input.next());
		*/
		System.out.println("------------------------");
		Test04 t1 = () -> {
			System.out.println("t1 실행");
			
		};
		t01.testClass(t1);
		t01.testClass(() -> {
			System.out.println("t1111111111 실행");
		} );
	}
}
