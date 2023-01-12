import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(binary_search(k, n, arr));
	}

	private static long binary_search(int k, int n, int[] arr) {
		long answer = 0;
		long lt = 1;
		long rt = Arrays.stream(arr).max().getAsInt();
		while(lt<=rt) {
			long mid = (lt+rt)/2;
			if(count(arr, mid)>=n) {
				answer = mid;
				lt = mid+1;
			} else {
				rt = mid-1;
			}
		}
		return answer;
	}

	private static long count(int[] arr, long length) {
		long count=0;
		for(int x : arr) {
			count += x/length;
		}
		
		return count;
	}

}
