import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// ���� ���� bmi, ������, ����
		String name;
		double bmi;
		float weight;
		float height_cm;
		double height_m;
		
		//��.���
		System.out.println("<BMI ����_ü���� ����>");
		System.out.print("�̸��� �Է����ּ���.");
		name = keyboard.next();
		System.out.print("������(kg) �� �Է����ּ���.");
		weight = keyboard.nextFloat();
		System.out.print("����(cm) �� �Է����ּ���.");
		height_cm = keyboard.nextFloat();
		height_m = height_cm * 0.01;
		bmi = weight / (height_m * height_m);
		
		//���
		System.out.println("<���>");
		System.out.println("�̸�:" + name);
		System.out.println("BMI����: " + bmi);
		keyboard.close();
		
	}

}
