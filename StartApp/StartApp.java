import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello,What's your name?"); //메세지 출력
		String name = keyboard.nextLine();
		System.out.println("Hello~~ " + name);
		System.out.println("좋아하는 취미가 뭐야?");
		String hobby = keyboard.nextLine();
		System.out.println("아하!" + name + " 씨는" + hobby + " 좋아하는 구나!! 나도야! 같이 할래?");
		System.out.println("아 참, 깜빡했는데, 나이가 어떻게 돼요?");
		int age = keyboard.nextInt();
		System.out.println(age + "살이요? 오! 동안이시네요");
	}
}
