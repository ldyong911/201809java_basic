package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * 1. 비교연산자
		 * - <(작다), >(크다), <=(작거나 같다), >=(크거나 같다), ==(같다), !=(같지 않다)
		 * - 두개의 값을 비교하는 연산자이다.
		 * - 비교결과가 참이면 true, 거짓이면 false를 반환한다.
		 * - 대소비교는 숫자 값 비교에 사용 가능하다.
		 * - 등가비교는 모든 자료형에 사용 가능하다.
		 */
		
		boolean b = 1 < 2;
		System.out.println(b);
		b = 1 > 2;
		System.out.println(b);
		b = 1 <= 1;
		System.out.println(b);
		b = 1 >= 1;
		System.out.println(b);
		
		//소수는 자릿수를 확정적으로 보장하는데 float형은 7자리, double형은 14자리이기 때문에 다른형의 소수를 비교하려면 형변환 필수
		b = 1 == 1.0f;
		System.out.println(b);
		b = 0.1 == 0.1f;
		System.out.println(b);
		System.out.printf("%22.20f%n", 0.55555555555555555555555f);
		System.out.printf("%22.20f%n", 0.55555555555555555555555);
		b = 0.1f == (float)0.1;
		System.out.println(b);
		
		//참조형은 new를 사용하여 초기화를 해야하지만 String만 예외적으로 new를 사용하지 않고도 초기화 가능
		//참조형에 값을 대입하고 비교하면 각 주소가 비교된다
		//예외적으로 같은 문자열을 비교하는 경우에만 같은 주소를 사용한다(메모리 낭비 줄임)
		b = "abcd" == "abcd";
		System.out.println(b);
		String str = new String("abcd");
		str = "abcd";
		b = "abcd" == new String("abcd");
		System.out.println(b);
		
		//equals는 메소드이며 객체끼리의 내용을 비교할 수 있음
		//equals는 대상의 내용 자체를 비교하지만 ==연산자는 비교하고자 하는 대상의 주소값을 비교한다
		b = "abcd".equals(new String("abcd"));
		System.out.println(b);
		
	}

}