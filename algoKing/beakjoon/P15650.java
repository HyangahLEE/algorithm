/*
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

	1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
	고른 수열은 오름차순이어야 한다.
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
