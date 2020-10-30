/*
 * �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
	�� ������ ���������̾�� �Ѵ�.
 * 
 * 4 2
 * 
 * >>
 * 1 2
 * 1 3
 * 1 4
 * 2 3
 * 2 4
 * 3 4
 * 
 * 
 * */

package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15650 {
	static int n, m;
	
	static void NM2(int cnt, String str, int start) {
		if(m == cnt) {
			System.out.println(str.trim());
			return;
		}
		for (int i = start; i <= n; i++) {
			NM2(cnt+1, str + i + " ", i+1);
		}
	};
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		NM2(0,"",1);
	}

}
