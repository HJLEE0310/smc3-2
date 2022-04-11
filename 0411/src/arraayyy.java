import java.util.Scanner;

public class arraayyy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int max = 0;
		String[] comp = new String[5];
		
		for(int i = 0; i < 5; i++) {
			comp[i] = "";
		}
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			for( ; arr[i] > 0; arr[i]--) {
				comp[i] += 'a';
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(comp[i]);
			if(comp[i].length() > comp[max].length()) {
				max = i;
			}
		}
		
		System.out.println((char)(max + '1'));
	}

}
