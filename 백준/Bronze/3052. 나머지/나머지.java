import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		boolean b;
		int effort = 0;

		for(int i=0; i<10; i++ ) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int i=0; i<10; i++ ) {
			b = false;
			for(int k=i+1; k<10; k++ ) {
				if( arr[i] == arr[k] ) {
					b = true;
					break;
				}
			}
			if( b == false ) {
				effort ++;
			}
		}
		sc.close();
		System.out.println(effort);
	}
}