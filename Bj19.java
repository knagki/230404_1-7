package bj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bj 2525
public class Bj19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(br.readLine());
		
		int m =60 * x + y;
		m += z;
		
		int H = (m / 60) % 24;
		int M = m % 60;

		System.out.println(H + " " + M);
	}
}
