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
3. 2753번
```java
package bj2;
// Bj 2753
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj16 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		if(x%4 == 0 && x%100 != 0 || x%400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

```
4. 14681번
```java
package bj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Bj 14681
public class Bj17 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
//		if(x > 0 && y > 0) {
//			System.out.println(1);
//		}else if(x < 0 && y > 0) {
//			System.out.println(2);
//		}else if(x < 0 && y < 0) {
//			System.out.println(3);
//		}else {
//			System.out.println(4);
//		}
		
		if (x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}
}


```
5. 2884번
```java
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
```

