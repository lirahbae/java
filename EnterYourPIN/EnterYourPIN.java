import java.util.Scanner;
public class EnterYourPIN {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���� ���࿡ ���� ���� ȯ���մϴ�");
		System.out.print("PIN �ѹ��� �Է����ּ��� >> ");
		
		int pin = 12345 ;
		int userinput ;
		userinput = keyboard.nextInt();
		while (pin != userinput) {
			System.out.println("�߸��� PIN�� �Է��ϼ̽��ϴ�.");
			System.out.print("�ٽ� �Է����ּ��� >> ");
			userinput = keyboard.nextInt();
		}
		System.out.println("�ݰ����ϴ�. �����");
		keyboard.close();
	}

}
