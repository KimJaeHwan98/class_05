	package lambda;
	interface Test02 {
		public void test();
		public void test111();
	}
	public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			@Override
			public void test() {
				System.out.println("test실행");
			}
		};
		t.test();
		System.out.println("----람다----");
		Test02 t02 = () -> System.out.println("test실행222");
		//매소드가 여러개 있으면 에러 발생.
		t02.test();
	}
}

	//인터페이스한 내용을 자동으로 불러주면 오버라이드를 자동으로 해준다
	//위 코드를 줄여논게 람다다.
	
	//위에 식과 아래 식은 동일하다