package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15649 {
	
	static int n, m;
	static Boolean[] vst;
	
	static void BT(int cnt, String str) {
		if(m == cnt) {
			System.out.println(str.trim());
			return;
		}
		for (int i = 1; i <= n; i++) {
			if(vst[i] = false) {
				vst[i] = true;
				BT(cnt + 1 , str + i + " ");
				vst[i] = false;
				
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		vst = new Boolean[n+1];
		BT(0, "");
	}

}
