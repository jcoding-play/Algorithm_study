import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
		}
		
		int count = 0;
		for(String x : str) {
			boolean b = true;
			char[] c = x.toCharArray();
			for(int i=1; i<c.length; i++) {
				if(c[i]!=c[i-1] && x.indexOf(c[i])!=i) {
					b = false;
					break;
				}
			}
			if(b) count++;
		}
		System.out.println(count);
	}

}
