import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "��° �Է�");
			arr[i] = sc.nextInt();
			
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		
		System.out.println("���� ū ���� " + (max+1) + "��° �����Դϴ�.");
	}

}
