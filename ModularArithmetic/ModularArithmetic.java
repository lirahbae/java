import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		
		//���� ����
		int a; //����ڿ��� ���� ����
		int quotient;  //�� : 10�� �ڸ�
		int remainder;  //������ : 1�� �ڸ�

		System.out.println("[�ʰ� ���� �ڸ��� ��]");
		System.out.print("2�ڸ� ���� �Է� (10~99) >> ");
		
		//����� �Է� (����)
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		while ((a < 10)||(a > 99)) { // while ( !((a>=10)&&(a<=99))
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.out.print("10~99 ������ ���ڸ� �Է��ϼ���. >> ");
			a = keyboard.nextInt();
		}
		keyboard.close();

		//10�� �ڸ��� 1�� �ڸ� ���ϱ�
		quotient = a / 10;  // 58 / 10 = 5�� �� ����.
		remainder = a % 10; // 58 % 10 = 8 �������� ����.
		
		//if���� ���� ��� ���.
		if (quotient == remainder) {
			System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		
//		int x = 0;
//		while (x < 5) {
//			System.out.println(x);
//			x = x + 1;
//		}
//		System.out.println("while�ݺ��� ��! ���� x:" + x);

	}

}
