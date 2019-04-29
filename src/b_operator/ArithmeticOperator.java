package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 1. 산술 연산자
		 * - +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)
		 * - 양쪽의 피연산자가 타입이 일치해야 연산이 가능하다.
		 * - int형(4byte)보다 크기가 작은 자료형은 int형으로 형변환 후 연산을 수행한다.
		 * - 두 개의 피연산자 중 자료형의 표현범위가 큰 쪽으로 형변환 후 연산을 수행한다.
		 * - 산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		 */

		int a = 1 + 2;
		System.out.println(a);
		a = a - 1;
		System.out.println(a);
		int c = a * 4;
		System.out.println(c);
		/*
		 * int d = c / 0; //에러 발생
		 * System.out.println(d); 
		 */
		float d = c/ 0f;
		System.out.println(d);
		int e = c / 3;
		System.out.println(e);
		float f = (float)c / 3f;
		System.out.println(f);
		float g = c % 3;
		System.out.println(g);
		float h = c % 0f;
		System.out.println(h);
		
		int x = 0;
		x = x + 1;
		x += 1;
		
		x = x - 2;
		x = x * 3;
		x = x / 4;
		x = x % 5;
		x -= 2;
		x *= 3;
		x /= 4;
		x %= 5;
		
		x = x+1;
		x += 1;
		x++;
		++x;
		
		x = x - 1;
		x -= 1;
		x--;
		--x;
		
		x = 0;
		System.out.println(x++);
		x = 0;
		System.out.println(++x);
		
		//문제1. 다음을 한줄씩 계산해서 최종결과값을 출력해주세요.
		//123456 + 654321
		//결과값 * 123456
		//결과값 / 123456
		//결과값 - 654321
		//결과값 % 123456
		
		long num = 0;
		num = 123456 + 654321;
		num = num * 123456;
		num = num / 123456;
		num = num - 654321;
		num = num % 123456;
		System.out.println(num);
		
	}

}