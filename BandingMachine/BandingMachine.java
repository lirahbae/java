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
		
		System.out.println("������� ���Ǳ� Banding Machine��");
		System.out.print("õ�� ���� >> ");
		thousand = keyboard.nextInt();
		System.out.print("����� ���� >> ");
		fiveHundred = keyboard.nextInt();
		money = thousand * 1000 + fiveHundred * 500;
		
		System.out.println(money + "�� �޾ҽ��ϴ�." );
		System.out.print("�����(" + drinkcost + "��) " + "�� �� �帱���?");
		drinknumber = keyboard.nextInt();
		totalcost = drinknumber * drinkcost;
		System.out.println("����� " + drinknumber + "�� " + totalcost + " �� �Դϴ�.");
		change = money - totalcost;
		System.out.println("�ܵ��� " + change + "���Դϴ�." );
		keyboard.close();
	}

}