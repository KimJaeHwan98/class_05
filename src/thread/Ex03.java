	package thread;

import java.util.Scanner;
class A03 extends Thread {
	public void run() {
		for( ; ; ) {
			System.out.println("문자가 날라왔습니다!!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		while(true) {
			System.out.println("문자열 입력 :" );
			str = input.next();
			System.out.println("입력한 값 :"+str);
		if(str.equals("end"))  {
			System.out.println("종료합니다");
			break;
		}
		}
		System.out.println("main이 종료합니다!!");
	}
}












// 하나하나 동시에 일을 하기때문에 입력하는 도중에도 2초마다 문자가 날라옵니다.
// Daemon을 사용하면 main이라는 메소드가 종료될때 같이 Thread도 종료해주세요
// set Daemon

// 개별적으로 동작이 가능하다
