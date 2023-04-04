# 230404_1-7
## 백준 조건문
1. 1330번
```java
package bj2;
// Bj 1330
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj14 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		/*입력란에 " " 인식하게 하는 클래스*/
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if (a < b) {
			System.out.println("<");
		}else if (a > b) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}

```
2. 9498번
```java
package bj2;
// Bj 9498
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		BufferedReader는 String타입으로 입력되기 때문에
		Integer.parseInt()로 int형으로 변환해야 됨
		BufferedReader가 Scanner보다 처리속도가 빠르다 이유는
		sc에 InputStreamReader는 문자열이 아닌 문자를 처리하고
		sc내부에 배열을 두어 문자열로 변환하여 인식하고
		br은 버퍼를 두어서 입력받은 문자를 쌓아둔 뒤에 한번에 문자열처럼 보내기 때문이다.
		정리하면
		br은 문자열을 그대로 읽기 때문에 정규식 검사를 하지않고
		sc는 문자를 읽어서 정규식 검사를 하기 때문이다
		출처: https://st-lab.tistory.com/41
		*/		
		int grade = Integer.parseInt(br.readLine());

		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
```
