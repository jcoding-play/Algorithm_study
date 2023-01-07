import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Sorting> list = new ArrayList<>();
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Sorting(x, y));
		}
		Collections.sort(list);
		for(Sorting p : list) {
			System.out.println(p.x + " " + p.y);
		}
	}

}

class Sorting implements Comparable<Sorting> {
	int x;
	int y;
	public Sorting(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Sorting o) {
		if(this.y == o.y) return this.x - o.x;
		return this.y - o.y;
	}
}
