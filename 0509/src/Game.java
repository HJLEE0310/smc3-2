import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("���� ���� ��");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int user = 0;
		int rsp = (int)(Math.random() * 100 % 3);
		
		switch(input) {
		case "����":
			user = 0;
			break;
		case "����":
			user = 1;
			break;
		case "��":
			user = 2;
			break;
		}
		
		
		switch(rsp) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		
		if(user-rsp == 0) {
			System.out.println("����");
		}
		else {
			if(user-rsp > 0) {
				if(user - rsp == 2) {
					System.out.println("����");
				}
				else {
					System.out.println("�̰��");
				}
			}
			else {
				if(user - rsp == -2) {
					System.out.println("�̰��");
				}
				else {
					System.out.println("����");
				}
			}
		}
	}
}