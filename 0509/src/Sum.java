import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int front = sc.nextInt();
		System.out.print("마지막 숫자: ");
		int rear = sc.nextInt();
		
		int sum = rear*(rear+1)/2 - front*(front-1)/2;
		
		System.out.println(front + "부터 " + rear + "까지의 합은 " + sum);
	}

}
