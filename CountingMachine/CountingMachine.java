import java.util.Scanner;
public class CountingMachine {

	public static void main(String[] args) {
	
		int number ;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� >> ");
		number = keyboard.nextInt();
		keyboard.close();
		for (int i = 1; i <= number; i++) {
			System.out.print(i + ".");
		}
		

	}

}
