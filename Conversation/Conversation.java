import java.util.Scanner;

public class Conversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("�ȳ�! �� �̸��� ����?");
		String name = keyboard.nextLine();
		System.out.println("�ȳ�" + name + "! �����̾�?");
		int birth = keyboard.nextInt();
		int age = 2019 - birth;
		System.out.println("��," + age + "���̱���. \n�� � ������ �¾��?");
		String season = keyboard.next();
		System.out.println(season + "�� �¾����. ������!");
		System.out.println("������ ���� ���� ������ٰ�. \n�׷� �¹���!");
		keyboard.close();
		
	}

}
