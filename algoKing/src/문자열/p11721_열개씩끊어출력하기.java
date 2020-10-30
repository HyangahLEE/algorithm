/*알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 * 
 * BaekjoonOnlineJudge
 * >>
 * OneTwoThre
 * eFourFiveS
 * ixSevenEig
 * htNineTen
 * */
package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char[] char_arr = st.toCharArray();

		for (int i = 0; i < st.length(); i++) {
			int a = i%10;		
			System.out.print(char_arr[i]);
			if(a == 9) {
				System.out.println();
			}		
			
		}
	}

}
