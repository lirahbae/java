import java.util.Scanner;

public class Conversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("안녕! 넌 이름이 뭐야?");
		String name = keyboard.nextLine();
		System.out.println("안녕" + name + "! 몇년생이야?");
		int birth = keyboard.nextInt();
		int age = 2019 - birth;
		System.out.println("아," + age + "살이구나. \n넌 어떤 계절에 태어났어?");
		String season = keyboard.next();
		System.out.println(season + "에 태어났구나. 멋지다!");
		System.out.println("다음엔 나에 대해 얘기해줄게. \n그럼 굿바이!");
		keyboard.close();
		
	}

}
