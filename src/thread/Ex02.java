	package thread;
	class MyThread {
		public void start() {
			run();
		}
		public void run() {
			System.out.println("부모 run");
		}
	}
	class A02 extends MyThread{
		public void run() {
			System.out.println("자식 run실행");
		}
	}
	public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		//a.run();
		a.start();
	}
}

	//mythread는 start라는 기능이 있어서 부모가 실행되고 자식클래스에 익스텐즈해줬으니까
	//자식 코드로 돌아와서 자식런을 실행한다.