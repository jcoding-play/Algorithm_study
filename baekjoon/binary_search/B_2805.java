import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] trees = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(binary_search(trees, m));
	}
	
	private static long binary_search(int[] trees, int m) {
		
		long answer = 0;
		long lt = 1;
		long rt = Arrays.stream(trees).max().getAsInt();
		while(lt<=rt) {
			long mid = (lt+rt)/2;
			if(count(trees, mid)>=m) {
				answer = mid;
				lt = mid+1;
			} else {
				rt = mid-1;
			}
		}
		
		return answer;
	}

	private static long count(int[] trees, long height) {
		long sum = 0;
		for(int x : trees) {
			if(x-height <= 0) {
				sum += 0;
			} else {
				sum += x-height;
			}
		}
		
		return sum;
	}
	
}
