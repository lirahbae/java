import java.util.Scanner;
public class LoopExercise {

//	public static void main(String[] args) {
//		
//		//���� ����
//		int a;
//		Scanner keyboard = new Scanner(System.in);
//		
//		//while�� 1. ������Է��� ���� �ݺ� �ϱ� ����
//		while (true) {
//			System.out.print("���ڸ� �Է��ϼ��� >>");
//			a = keyboard.nextInt(); 	//���� �Է�
//			
//			//while�� 2. a ���ڿ� ���� �� ��½�Ű��
//			int i = 0;
//			while (i < a) {
//				System.out.print("*");
//				i++; //i = i + 1; �� ����
//			}
//			System.out.println(); //���� ���忡�� ��µǱ� ���� ����.
//		}
////		keyboard.close(); //������Է��� ��� ���� �ݺ��ɰŶ� ���� �ʿ䰡 ����.
//	}

	public static void main(String[] args) {
		int a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� >>");
		a = keyboard.nextInt();
		
		//for��
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}
		keyboard.close();
	}
	
}
