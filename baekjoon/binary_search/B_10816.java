import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] N = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int[] M = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			M[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(N);
		for(int x : M) {
			int a = upper_bound(N, x);
			int b = lower_bound(N, x);

			sb.append(a-b).append(" ");
		}
		System.out.println(sb);
	}
	
	private static int upper_bound(int[] N, int key) {
		int lt = 0;
		int rt = N.length;
		while(lt<rt) {
			int mid = (lt+rt)/2;
			if(N[mid]<=key) {
				lt = mid+1;
			} else if(N[mid]>key) {
				rt = mid;
			}
		}
		return lt;
	}
	
	private static int lower_bound(int[] N, int key) {
		int lt = 0;
		int rt = N.length;
		while(lt<rt) {
			int mid = (lt+rt)/2;
			if(N[mid]<key) {
				lt = mid+1;
			} else if(N[mid]>=key) {
				rt = mid;
			}
		}
		return lt;
	}

}
