import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		
		//���� ����
		int a; //����ڿ��� ���� ����
		int quotient;  //�� : 10�� �ڸ�
		int remainder;  //������ : 1�� �ڸ�
		boolean isValid; //���� ��ȿ�Ѱ�? �� ���� T/F��

		System.out.println("[�ʰ� ���� �ڸ��� ��]");
		
		//����� �Է� ��� 1. a ������ �ٲ�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("2�ڸ� ���� �Է� (10~99) >> ");
		a = keyboard.nextInt();
		while ((a < 10)||(a > 99)) { // while (!((a>=10)&&(a<=99))) �̰͵� ����.
			System.out.print("2�ڸ� ���� �Է� (10~99) >> ");
			a = keyboard.nextInt();
		}
		keyboard.close();

		//����� �Է� ��� 2. boolean ������ ����� ���� ��ȿ���� �Ǻ�
//		Scanner keyboard = new Scanner(System.in);
//		a = keyboard.nextInt();
//		isValid = (a>=10)&&(a<=99);
//		while (!isValid) {
//			System.out.print("2�ڸ� ���� �Է� (10~99) >> ");
//			a = keyboard.nextInt();
//			isValid = (a>=10)&&(a<=99);
//		}
//		keyboard.close();
		
		
		//����� �Է� ��� 3. do while�ݺ����� �̿�. 
//		WHY? ���1ó�� '2�ڸ� ���� �Է��϶�'�� �ݺ����� �ڵ��� ���̱� ���ؼ�
//		Scanner keyboard = new Scanner(System.in);
//		do {
//			System.out.print("2�ڸ� ���� �Է� (10~99) >> ");
//			a = keyboard.nextInt();
//		} while ((a < 10)||(a > 99));
//		keyboard.close();
//		
		
//		<�ۼ���>
//		while (/*üũ�����ǹ�*/) {
//			//while���ǹ��� ������ �ݺ��� �͵�..
//		}
//		do {
//			//�켱 �ѹ� �����ϰ�, while���� üũ�� �ٽ� �ݺ���ų �͵�...
//		} while (/*üũ�����ǹ�*/);
		
		
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
		
		// while �ݺ��� ����
//		int x = 0;
//		while (x < 5) {
//			System.out.println(x);
//			x = x + 1;
//		}
//		System.out.println("while�ݺ��� ��! ���� x:" + x);

	}

}
