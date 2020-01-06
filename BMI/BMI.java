import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// 변수 정의 bmi, 몸무게, 신장
		String name;
		double bmi;
		float weight;
		float height_cm;
		double height_m;
		
		//입.출력
		System.out.println("<BMI 계산기_체질량 지수>");
		System.out.print("이름을 입력해주세요.");
		name = keyboard.next();
		System.out.print("몸무게(kg) 를 입력해주세요.");
		weight = keyboard.nextFloat();
		System.out.print("신장(cm) 을 입력해주세요.");
		height_cm = keyboard.nextFloat();
		height_m = height_cm * 0.01;
		bmi = weight / (height_m * height_m);
		
		//결과
		System.out.println("<결과>");
		System.out.println("이름:" + name);
		System.out.println("BMI지수: " + bmi);
		keyboard.close();
		
	}

}
