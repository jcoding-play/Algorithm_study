import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int[] B = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] answer = new int[m];

		Arrays.sort(A);
		int i = 0;
		for(int x : B) {
			int lt = 0;
			int rt = n-1;
			while(lt<=rt) {
				int mid = (lt+rt)/2;
				if(A[mid]==x) {
					answer[i] = 1;
					break;
				}else if(A[mid]<x) {
					lt = mid+1;
				}else {
					rt = mid-1;
				}
			}
			i++;
		}
		for(int a : answer) {
			System.out.println(a);
		}
	}

}
