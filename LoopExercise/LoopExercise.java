import java.util.Scanner;
public class LoopExercise {

//	public static void main(String[] args) {
//		
//		//변수 선언
//		int a;
//		Scanner keyboard = new Scanner(System.in);
//		
//		//while문 1. 사용자입력을 무한 반복 하기 위해
//		while (true) {
//			System.out.print("숫자를 입력하세요 >>");
//			a = keyboard.nextInt(); 	//숫자 입력
//			
//			//while문 2. a 숫자에 맞춰 별 출력시키기
//			int i = 0;
//			while (i < a) {
//				System.out.print("*");
//				i++; //i = i + 1; 과 같음
//			}
//			System.out.println(); //다음 문장에서 출력되기 위해 넣음.
//		}
////		keyboard.close(); //사용자입력은 계속 무한 반복될거라 닫을 필요가 없음.
//	}

	public static void main(String[] args) {
		int a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>");
		a = keyboard.nextInt();
		
		//for문
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}
		keyboard.close();
	}
	
}
