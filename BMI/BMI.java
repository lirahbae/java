import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		// 변수 선언
		String name;
		float height_cm;
		double height_m;  
		float weight;
		double bmi;
		String obesity;
		
		//사용자 입력
		Scanner keyboard = new Scanner(System.in);
		System.out.println("[BMI 계산기]");
		System.out.print("이름 : ");
		name = keyboard.next();
		System.out.print("신장 cm : ");
		height_cm = keyboard.nextFloat();
		height_m = height_cm * 0.01;
		System.out.print("몸무게 kg : ");
		weight = keyboard.nextFloat();
		keyboard.close();
		
		//체질량지수 계산
		bmi = weight / (height_m * height_m);  //BMI지수 = 몸무게 kg ÷ (키 m × 키 m)
		
		// if조건문을 활용한 BMI지수별 비만등급
		if (bmi < 18.5) {
			obesity = "저체중";
		}
		else if (18.5 <= bmi && bmi < 23) {
			obesity = "정상체중";
		}
		else if (23 <= bmi && bmi < 25) {
			obesity = "과체중";
		}
		else if (25 <= bmi && bmi < 30) {
			obesity = "비만";
		}
		else {
			obesity = "고도비만";
		}
		
		//결과
		System.out.println("[결과]");
		System.out.println("이름 : " + name);
		//String.format("%.1f", 변수) 는 소수점 2번째 자리에서 반올림.
		System.out.print("BMI 지수는 " + String.format("%.1f", bmi) + ", ");
		System.out.println(obesity + "입니다.");
		System.out.println("(BMI 지수는 키와 몸무게만을 이용해 계산한 체질량지수로, 근육량을 고려하지 않은 수치입니다.)");
		
	}

}
