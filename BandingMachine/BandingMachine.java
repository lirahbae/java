import java.util.Scanner;

public class BandingMachine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int thousand;
		int fiveHundred;
		int money;
		int change;
		int drinknumber;
		int drinkcost = 800;
		int totalcost;
		int extraThousand;
		int extraFiveHundred;
		int extraMoney = 0;
		
		System.out.println("������� ���Ǳ� Banding Machine��");
		System.out.print("õ�� ���� >> ");
		thousand = keyboard.nextInt();
		System.out.print("����� ���� >> ");
		fiveHundred = keyboard.nextInt();
		money = thousand * 1000 + fiveHundred * 500;
		System.out.println(money + "�� �޾ҽ��ϴ�." );
	
		//����� ���� �Է�
		System.out.print("�����(" + drinkcost + "��) " + "�� �� �帱���? ");
		drinknumber = keyboard.nextInt();
		
		//����� ���� ���
		totalcost = drinknumber * drinkcost;
		System.out.println("����� " + drinknumber + "�� " + totalcost + " �� �Դϴ�.");
		
		//if��:�ܵ� �����ϸ� �޼��� ���
		if (money < totalcost) {
			System.out.println(totalcost - money + "���� ���ڶ�׿�.");
			System.out.print("õ�� ���� >> ");
			extraThousand = keyboard.nextInt();
			System.out.print("����� ���� >> ");
			extraFiveHundred = keyboard.nextInt();
			extraMoney = extraThousand * 1000 + extraFiveHundred * 500;
			System.out.println(extraMoney + "�� ���� �� " + (money + extraMoney) + "�� �޾ҽ��ϴ�.");
			
		}
		
		//for��: ����� ������ ���� ��! �ݺ����
		for (int i = 0; i < drinknumber; i++) {
			System.out.print("��!");
		}
		//�ܵ� ���
		change = money + extraMoney - totalcost;
		System.out.println("\n�ܵ��� " + change + "���Դϴ�." );
		keyboard.close();
		
	}

}
