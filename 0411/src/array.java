import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번째 입력");
			arr[i] = sc.nextInt();
			
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		
		System.out.println("가장 큰 수는 " + (max+1) + "번째 숫자입니다.");
	}

}
