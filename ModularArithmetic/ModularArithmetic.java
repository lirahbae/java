import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		
		//변수 선언
		int a;
		int quotient;  //몫 : 10의 자리
		int remainder;  //나머지 : 1의 자리
		
		//사용자 입력
		Scanner keyboard = new Scanner(System.in);
		a = keyboard.nextInt();

		//10의 자리와 1의 자리 구하기
		quotient = a / 10;
		remainder = a % 10;
		
		System.out.println(quotient);
		System.out.println(remainder);
		

	}

}
