package thread;
//Thread / sleep 
class A01 extends Thread {
	public void run() { //오버라이딩을 해야한다. 이메소드를 사용해야 쓰레드동작
		//sleep(1000);
		for(int i=0;i<100;i++)
			System.out.println("i :"+i);
	}
}
class B01 extends Thread {
	public void run() {
		for(int k=0;k<100;k++)
			System.out.println("k :"+k);
	}
}


public class Ex01 {
public static void main(String[] args) {
	A01 a =new A01();
	B01 b =new B01();
	//a.run(); 	b.run();
	a.start();
	b.start();
	// Thread가 가지고있는 기능이다 그래서 사용이 가능하다.
	//a.start하면 run이 시작된다.
	// public void run을 사용하고 tered를 사한다 
}
}
