import java.util.Scanner;
public class EnterYourPIN {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("리라 은행에 오신 것을 환영합니다");
		System.out.print("PIN 넘버를 입력해주세요 >> ");
		
		int pin = 12345 ;
		int userinput ;
		userinput = keyboard.nextInt();
		while (pin != userinput) {
			System.out.println("잘못된 PIN을 입력하셨습니다.");
			System.out.print("다시 입력해주세요 >> ");
			userinput = keyboard.nextInt();
		}
		System.out.println("반갑습니다. 리라님");
		keyboard.close();
	}

}
