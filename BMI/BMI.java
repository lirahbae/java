import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		// ���� ����
		String name;
		float height_cm;
		double height_m;  
		float weight;
		double bmi;
		String obesity;
		
		//����� �Է�
		Scanner keyboard = new Scanner(System.in);
		System.out.println("[BMI ����]");
		System.out.print("�̸� : ");
		name = keyboard.next();
		System.out.print("���� cm : ");
		height_cm = keyboard.nextFloat();
		height_m = height_cm * 0.01;
		System.out.print("������ kg : ");
		weight = keyboard.nextFloat();
		keyboard.close();
		
		//ü�������� ���
		bmi = weight / (height_m * height_m);  //BMI���� = ������ kg �� (Ű m �� Ű m)
		
		// if���ǹ��� Ȱ���� BMI������ �񸸵��
		if (bmi < 18.5) {
			obesity = "��ü��";
		}
		else if (18.5 <= bmi && bmi < 23) {
			obesity = "����ü��";
		}
		else if (23 <= bmi && bmi < 25) {
			obesity = "��ü��";
		}
		else if (25 <= bmi && bmi < 30) {
			obesity = "��";
		}
		else {
			obesity = "����";
		}
		
		//���
		System.out.println("[���]");
		System.out.println("�̸� : " + name);
		//String.format("%.1f", ����) �� �Ҽ��� 2��° �ڸ����� �ݿø�.
		System.out.print("BMI ������ " + String.format("%.1f", bmi) + ", ");
		System.out.println(obesity + "�Դϴ�.");
		System.out.println("(BMI ������ Ű�� �����Ը��� �̿��� ����� ü����������, �������� ������� ���� ��ġ�Դϴ�.)");
		
	}

}
