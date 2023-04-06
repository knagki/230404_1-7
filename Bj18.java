package bj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Bj 2884
public class Bj18 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
//		10 10 - 45 = 9 25
//		10 * 60 + 10 - 45 = 565 / 60 = 9 + " " + 565 % 60 = 25
//		9 25
		if (H == 0) {
			H = 24;
			if(M >= 45) {
				H = 0;
			}
		}
		System.out.println((H * 60 + M - 45) / 60 + " " + (H * 60 + M - 45) % 60);
	}
}
