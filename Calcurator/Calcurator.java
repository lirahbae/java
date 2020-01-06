import java.util.Scanner;

public class Calcurator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		float a;
		float b;
		int result;
		boolean x;
		a = 5;
		b = 3;	
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a == 5);
		System.out.println(a == 0);
		
		System.out.println("숫자를 입력하세요.");
		int c = keyboard.nextInt();
		
		if (c % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		keyboard.close();
	}

}
