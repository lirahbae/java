import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int won;  // int�� ����
		float dollar;  // float�� �Ǽ�
		
		// ����� �Է�
		System.out.println("��ȭ > �޷� ����");
		System.out.println("��ȭ�� �Է��ϼ��� >>");
		won = keyboard.nextInt();
		dollar = (float)won / 1100; // won�� ��� float �Ǽ� ���·� �ٲ����. �׷��� dollar�� �Ҽ��� ���·� ����.
		System.out.println(won + "���� " + "$" + dollar + "�Դϴ�.");
		keyboard.close();
	}

}
