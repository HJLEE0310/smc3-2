import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("500 이하의 자연수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 3; i <= num; i += 6) {
			sum += i;
			System.out.println(i);
		}
		
		System.out.println("1~" + num + "까지 3의 배수이면서 홀수인 수의 합은 " + sum + "입니다");
	}

}
