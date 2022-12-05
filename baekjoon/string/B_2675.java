import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(char c : str.toCharArray()) {
				for(int j=0; j<k; j++) {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}

}
