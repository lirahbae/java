import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		
		//변수 선언
		int a; //사용자에게 받을 정수
		int quotient;  //몫 : 10의 자리
		int remainder;  //나머지 : 1의 자리

		System.out.println("[십과 일의 자리수 비교]");
		System.out.print("2자리 정수 입력 (10~99) >> ");
		
		//사용자 입력 (정수)
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();
		while ((a < 10)||(a > 99)) { // while ( !((a>=10)&&(a<=99))
			System.out.println("잘못 입력했습니다.");
			System.out.print("10~99 사이의 숫자를 입력하세요. >> ");
			a = keyboard.nextInt();
		}
		keyboard.close();

		//10의 자리와 1의 자리 구하기
		quotient = a / 10;  // 58 / 10 = 5로 몫만 나옴.
		remainder = a % 10; // 58 % 10 = 8 나머지만 나옴.
		
		//if문을 통해 결과 출력.
		if (quotient == remainder) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		
//		int x = 0;
//		while (x < 5) {
//			System.out.println(x);
//			x = x + 1;
//		}
//		System.out.println("while반복문 끝! 현재 x:" + x);

	}

}
