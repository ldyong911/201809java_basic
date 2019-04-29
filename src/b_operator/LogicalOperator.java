package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 1. 논리 연산자
		 * - &&(그리고;AND), ||(또는;OR), !(아니다;NOT)
		 * - &&와 ||는 다수의 조건을 결합할때 사용할 수 있다.
		 * - &&와 ||는 boolean형 값을 피연산자로 사용한다.
		 * - !은 boolean형 값을 반대로 바꾼다. true => false, false => true
		 */
		
		//Dead code는 자바가 효율적으로 처리하기 위해 값이 확정적이면 그 뒤 코드는 실행하지 않기 때문에 dead code이다
		boolean b;
		b = true && true;
		System.out.println(b);
		b = true && false;
		System.out.println(b);
		b = false && true;
		System.out.println(b);
		b = false && false;
		System.out.println(b);
		
		b = true || true;
		System.out.println(b);
		b = true || false;
		System.out.println(b);
		b = false || true;
		System.out.println(b);
		b = false || false;
		System.out.println(b);
		
		boolean b2 = false;
		b2 = !b2;
		System.out.println(b2);
		String str = "abcd";
		b2 = !str.equals("abc");
		System.out.println(b2);
		
		//연산자 우선순위는 산술 > 비교 > 논리 > 대입 순으로 진행되며 우선순위를 바꿔주려면 괄호로 감싸면 된다
		//논리연산자 경우엔 && > || 순으로 진행된다
		int x = 1, y = 2;
		boolean b3 = false;
		b3 = (x + 3) * y > y - 2 || x < 3 && y >= 5;
		System.out.println(b3);
		
		/*
		 * 비트 연산자
		 * - &(AND), |(OR), ^(XOR), ~(비트전환), <<(쉬프트), >>(쉬프트)
		 * - 비트단위로 연산한다.
		 * - & : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - | : 피연산자 중 한 쪽의 값이 1이면, 1을 그외는 0을 결과로 얻는다.
		 * - ^ : 피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.
		 * - ~ : 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * - << : 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * - >> : 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 * 
		 * 기타 연산자
		 * - (type) : 형변환(캐스팅)
		 * - 조건식 ? true : false(삼항연산자)
		 * - instanceof
		 */
		
		//삼항연산자 경우엔 조건식이 참인 경우 ? 뒤에 첫번째 값이 되고, 조건식이 거짓인 경우 ? 뒤에 두번째 값이 된다
		int num1 = 1;
		int num2 = 2;
		int num3 = (num1 > num2) ? num1 : num2;
		System.out.println(num3);
		
	}

}