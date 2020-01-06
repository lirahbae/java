import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int won;  // int는 정수
		float dollar;  // float은 실수
		
		// 사용자 입력
		System.out.println("원화 > 달러 계산기");
		System.out.println("원화를 입력하세요 >>");
		won = keyboard.nextInt();
		dollar = (float)won / 1100; // won을 잠시 float 실수 형태로 바꿔놓음. 그래야 dollar가 소수점 형태로 나옴.
		System.out.println(won + "원은 " + "$" + dollar + "입니다.");
		keyboard.close();
	}

}
