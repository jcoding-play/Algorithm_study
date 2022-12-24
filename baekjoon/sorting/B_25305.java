import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] x = new int[n];
		for(int i=0; i<n; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(x);
		int count = 0;
		for(int i=x.length-1; i>=0; i--) {
			count++;
			if(count==k) {
				System.out.println(x[i]);
				break;
			}
		}

	}

}
