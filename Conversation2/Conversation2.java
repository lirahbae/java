import java.util.Scanner;

public class Conversation2 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// ���� ����
		int month;
		String season = "";
		String name = "";
		int year;
		int age;
		
		// ����� �Է�_�̸�
		System.out.println("�ȳ�! �� �̸��� ������. \n�� �̸��� ����?");
		name = keyboard.next();
		System.out.println(name + ".. ������ ���!");
		
		// ���� ��, ���� �Է�
		System.out.println("���� �� �⵵�� �¾��?");
		year = keyboard.nextInt();
		age = 2020 - year;
		System.out.println("����" + age + "�� �̱���.");
		System.out.println("�� ���� �¾�ž�?");
		month = keyboard.nextInt();
		
		// season ����� �����ϱ� ���� month�� ���� if ���ǹ�
		if ((3 <= month) && (month <= 5)) { 
			season = "��";
		}
		else if ((6 <= month) && (month <= 8)) {
			season = "����";
		}
		else if ((9 <= month) && (month <= 11)) {
			season = "����";
		}
		else if ((month == 12) || (month == 1) || (month == 2)) {
			season = "�ܿ�";
		}
		else {
			System.out.println("1~12������ ���");
		}
		// if ���ǹ��� season ��� ���
		System.out.println("�� ������ " + season + "�̱���! ���� �����̾�.");
		keyboard.close();
		// ��ȭ ���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + year + "�� " + month + "��");
	}
}
