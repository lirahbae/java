import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello,What's your name?"); //�޼��� ���
		String name = keyboard.nextLine();
		System.out.println("Hello~~ " + name);
		System.out.println("�����ϴ� ��̰� ����?");
		String hobby = keyboard.nextLine();
		System.out.println("����!" + name + " ����" + hobby + " �����ϴ� ����!! ������! ���� �ҷ�?");
		System.out.println("�� ��, �����ߴµ�, ���̰� ��� �ſ�?");
		int age = keyboard.nextInt();
		System.out.println(age + "���̿�? ��! �����̽ó׿�");
	}
}
