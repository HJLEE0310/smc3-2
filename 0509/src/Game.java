import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("가위 바위 보");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int user = 0;
		int rsp = (int)(Math.random() * 100 % 3);
		
		switch(input) {
		case "가위":
			user = 0;
			break;
		case "바위":
			user = 1;
			break;
		case "보":
			user = 2;
			break;
		}
		
		
		switch(rsp) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		
		if(user-rsp == 0) {
			System.out.println("비겼다");
		}
		else {
			if(user-rsp > 0) {
				if(user - rsp == 2) {
					System.out.println("졌다");
				}
				else {
					System.out.println("이겼다");
				}
			}
			else {
				if(user - rsp == -2) {
					System.out.println("이겼다");
				}
				else {
					System.out.println("졌다");
				}
			}
		}
	}
}