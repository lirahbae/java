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
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int c = keyboard.nextInt();
		
		if (c % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		keyboard.close();
	}

}
