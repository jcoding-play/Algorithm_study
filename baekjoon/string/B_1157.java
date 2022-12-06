import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase(); // 대소문자 구분을 하지 않기 위해 입력받은 문자열을 다 대문자로 변경 
		
		int max = 0;
		// max_count 변수는 최대 개수를 가진 문자가 여러개이면 '?'를 출력하고 아니라면 해당 문자를 출력하므로 
		// max_count 변수를 통해 최대 개수를 가진 문자가 몇개인지 확인해준다. 
		int max_count = 0;	
		char answer = ' ';
		
		for(int i=0; i<str.length(); i++) {
			
			// 문자를 확인할 때 해당 문자가 그 전에 이미 검사를 했던 문자면 다음 문자로 넘어가준다.  
			if(str.indexOf(str.charAt(i))!=i) {
				continue;
			}
			
			int count = 0;
			for(int j=i; j<str.length(); j++) {
				// 해당 문자와 같은 문자가 있다면 count 변수를 증가시켜준다. 
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			if(count>max) {
				max = count;
				answer = str.charAt(i);
				max_count = 0;
			}
			else if(count==max) {
				max_count++;
			}
		}
		
		// 최대 개수를 가진 문자가 중복되지 않으면 문자를 출력, 아니라면 '?'를 출력해준다. 
		if(max_count==0) {
			System.out.println(answer);
		}
		else System.out.println("?");
	}

}
