/*[N과 M]
 * 
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 
 * 4 2
 * >
 * 1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3
 * 
 * 
 * */
package beakjoon;

import java.io.*;
import java.util.*;
public class p15649_주녁 {
	static int n, m;
	static boolean[] vst;
	static void BT(int cnt, String str) {
		if(m == cnt) {
			System.out.println(str.trim());
			return;
		}
		for(int i = 1; i <= n; i++) {
			if(vst[i] == false) {
				vst[i] = true;
				BT(cnt + 1, str + i + " ");
				vst[i] = false;
			}
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		vst = new boolean[n+1];
		BT(0, "");
	}

}
