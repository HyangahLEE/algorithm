/*
 *���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. 
 *�� ���ڿ����� �� ���� �ܾ ������? 
 *�̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�. 
*/
package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class p1152 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		System.out.println(st.countTokens());
	}

}
