/*���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * BaekjoonOnlineJudge
 * >>
 * OneTwoThre
 * eFourFiveS
 * ixSevenEig
 * htNineTen
 * */
package ���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11721_��������������ϱ� {

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
