import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int front = sc.nextInt();
		System.out.print("������ ����: ");
		int rear = sc.nextInt();
		
		int sum = rear*(rear+1)/2 - front*(front-1)/2;
		
		System.out.println(front + "���� " + rear + "������ ���� " + sum);
	}

}
