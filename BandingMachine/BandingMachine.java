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
		
		System.out.println("★음료수 자판기 Banding Machine★");
		System.out.print("천원 개수 >> ");
		thousand = keyboard.nextInt();
		System.out.print("오백원 개수 >> ");
		fiveHundred = keyboard.nextInt();
		money = thousand * 1000 + fiveHundred * 500;
		System.out.println(money + "원 받았습니다." );
	
		//음료수 개수 입력
		System.out.print("음료수(" + drinkcost + "원) " + "몇 개 드릴까요? ");
		drinknumber = keyboard.nextInt();
		
		//음료수 가격 출력
		totalcost = drinknumber * drinkcost;
		System.out.println("음료수 " + drinknumber + "개 " + totalcost + " 원 입니다.");
		
		//if문:잔돈 부족하면 메세지 출력
		if (money < totalcost) {
			System.out.println(totalcost - money + "원이 모자라네요.");
			System.out.print("천원 개수 >> ");
			extraThousand = keyboard.nextInt();
			System.out.print("오백원 개수 >> ");
			extraFiveHundred = keyboard.nextInt();
			extraMoney = extraThousand * 1000 + extraFiveHundred * 500;
			System.out.println(extraMoney + "원 더해 총 " + (money + extraMoney) + "원 받았습니다.");
			
		}
		
		//for문: 음료수 개수에 따라 텅! 반복출력
		for (int i = 0; i < drinknumber; i++) {
			System.out.print("텅!");
		}
		//잔돈 출력
		change = money + extraMoney - totalcost;
		System.out.println("\n잔돈은 " + change + "원입니다." );
		keyboard.close();
		
	}

}
