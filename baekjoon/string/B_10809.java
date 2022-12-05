import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		// 알파벳 위치를 저장하기 위한 배열 (0-25가 차례로 소문자 a-z에 해당한다.) 
		int[] arr = new int[26];	 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		for(int i=0; i<str.length(); i++) {
			// 알파벳이 처음 등장하는 위치 값을 포함하기 위해 indexOf 메서드를 이용한다. 
			arr[str.charAt(i)-'a'] = str.indexOf(str.charAt(i)); 	
		}
	
		
		for(int x : arr) {
			System.out.print(x + " ");
		}

	}

}
