import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		
		//���� ����
		int a;
		int quotient;  //�� : 10�� �ڸ�
		int remainder;  //������ : 1�� �ڸ�
		
		//����� �Է�
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();

		//10�� �ڸ��� 1�� �ڸ� ���ϱ�
		quotient = a / 10;
		remainder = a % 10;
		
		System.out.println(quotient);
		System.out.println(remainder);
		

	}

}
