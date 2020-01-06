import java.util.Scanner;

public class Conversation2 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// 변수 선언
		int month;
		String season = "";
		String name = "";
		int year;
		int age;
		
		// 사용자 입력_이름
		System.out.println("안녕! 내 이름을 지어줘. \n내 이름은 뭐야?");
		name = keyboard.next();
		System.out.println(name + ".. 마음에 들어!");
		
		// 생년 월, 나이 입력
		System.out.println("나는 몇 년도에 태어났어?");
		year = keyboard.nextInt();
		age = 2020 - year;
		System.out.println("나는" + age + "살 이구나.");
		System.out.println("몇 월에 태어난거야?");
		month = keyboard.nextInt();
		
		// season 결과를 도출하기 위한 month에 대한 if 조건문
		if ((3 <= month) && (month <= 5)) { 
			season = "봄";
		}
		else if ((6 <= month) && (month <= 8)) {
			season = "여름";
		}
		else if ((9 <= month) && (month <= 11)) {
			season = "가을";
		}
		else if ((month == 12) || (month == 1) || (month == 2)) {
			season = "겨울";
		}
		else {
			System.out.println("1~12까지만 써라");
		}
		// if 조건문의 season 출력 결과
		System.out.println("내 생일은 " + season + "이구나! 멋진 계절이야.");
		keyboard.close();
		// 대화 요약
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("생일 : " + year + "년 " + month + "월");
	}
}
