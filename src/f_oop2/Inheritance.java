package f_oop2;

import java.util.Vector;

public class Inheritance {

	public static void main(String[] args) {
		/*
		 * 1. 상속
		 * - 자식클래스명 extends 부모클래스명{}
		 * - 기존의 클래스를 물려받아 새로운 클래스를 만드는 것이다.
		 * - 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려받는다.
		 * - 클래스를 상속받는 것은 하나만 가능하다.
		 * - 자식 클래스는 부모 클래스의 멤버 외의 새로운 멤버를 가질 수 있으므로 자식 클래스는 부모 클래스보다 크거나 같다.
		 * - 상속받지 않는 모든 클래스는 Object 클래스를 상속받는다.
		 * 
		 * 2. super, super()
		 * - 부모 클래스명 대신 사용된다.
		 * - super는 부모 클래스의 멤버에 접근하기 위해 사용한다.
		 * - super대신 this를 사용해도 부모 클래스의 멤버에 접근할 수 있다.
		 * - 부모와 자식의 멤버가 서로 중복되어 구분이 필요할때 super를 사용한다.
		 * - super()는 부모 클래스의 생성자를 호출하기 위해 사용한다.
		 * - 자식 클래스 생성자의 첫줄에는 super()가 있어야 한다.
		 * 
		 * 3. 오버라이딩
		 * - 상속받은 메서드의 내용을 재정의하는 것이다.
		 * - 상속받은 메서드와 메서드명, 매개변수, 리턴타입이 같아야 한다.
		 * - 상속받은 메서드보다 좁은 범위의 접근제어자로 변경할 수 없다.
		 * - 상속받은 메서드보다 많은 예외를 선언할 수 없다.
		 * - static을 빼거나 더할 수 없다.
		 * 
		 * 4. 다형성
		 * - 부모타입으로 여러 자식타입들을 대신하는 것이다.
		 * - 부모타입으로 생성된 객체는 부모타입에 정의된 멤버만 사용 가능하다.
		 * - 부모타입과 자식타입은 서로 형변환이 가능하다.
		 * - 자식타입 > 부모타입 : Up-casting(생략가능)
		 * - 부모타입 > 자식타입 : Down-casting(생략불가)
		 * - 형변환이 인스턴스에 영향을 주진 않는다.
		 * - 부모타입에서 자식타입으로 형변환시 instanceof 연산자로 인스턴스를 확인하는 것이 안전하다.
		 * - 부모와 자식에 동일한 메서드가 있는 경우 자식의 메서드를 사용한다.
		 * - 부모와 자식에 동일한 멤버변수가 있는 경우 부모타입에서는 부모의 변수를 자식타입에서는 자식의 변수를 사용한다.
		 * 
		 * 5. 제어자(접근제어자)
		 * - 외부로부터 데이터를 보호하거나 감추기 위해 사용한다.
		 * - 접근제어자 : private, (default), protected, public
		 * - private : 같은 클래스 내에서만 접근이 가능하다.
		 * - default : 같은 패키지 내에서만 접근이 가능하다.
		 * - protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
		 * - public : 접근에 제한이 없다.
		 * - 그외 제어자 : static, final, abstract(더 있지만 초급의 범위를 벗어남)
		 * 
		 */
		
		SampleParent sp = new SampleParent();
		
		System.out.println(sp.parentVariable);
		sp.parentMethod();
		
		SampleChild sc = new SampleChild();
		
		System.out.println(sc.childVariable);
		sc.childMethod();
		
		//상속받은 부모의 변수와 메서드를 사용할 수 있다.
		System.out.println(sc.parentVariable);
		sc.parentMethod();
		
		//부모타입으로 선언하면 부모클래스의 멤버만 사용이 가능하다.
		//자식클래스의 인스턴스이기 때문에 실제로 실행되는 것은 자식클래스의 메서드이다.
		SampleParent poly = new SampleChild();
		System.out.println(poly.parentVariable);
		poly.parentMethod();
		
		//---------------------------------------------------------------
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//----------------------------------------------------------------
		
		Time t = new Time();
		
//		t.setHour(17);
//		t.setMinute(3);
//		t.setSecond(99);
//		
//		System.out.println(t);
		
		//문제1. Time 클래스의 유효성을 체크하는 로직을 만들어주세요.
		
		//문제2. Time 클래스의 시분초 셋팅시 초과되는 부분을 고려한 로직을 만들어주세요.
		t.setSecond(100000);
		System.out.println(t);  //3:46:40
		t.setMinute(40);
		t.setHour(5);;
		System.out.println(t);
		
		//----------------------------------------------------------------
		
		/*
		 * Vector
		 * - add(Object) : 객체를 저장한다. 저장에 성공하면 true 실패하면 false를 반환한다.
		 * - remove(Object) : 저장되어 있는 객체를 제거한다. 제거에 성공하면 true, 실패하면 false를 반환한다.
		 * - isEmpty() : 비어있는지 검사한다. 비어있으면 true 비어있지 않으면 false를 반환한다.
		 * - get(int) : 지정된 위치의 객체를 반환한다. 반환타입은 Object 이므로 형변환이 필요하다.
		 * - size() : 저장된 객체의 수를 반환한다.
		 * 
		 */
		
		//기본형 타입에 대응되는 참조형 타입
		//int > Integer
		//double > Double
		//boolean > Boolean
		
		Vector<String> v = new Vector<String>();  //<>안에는 타입을 기술해주는데 참조형타입만 올 수 있음
		
		v.add("A");
		v.add("B");
		v.add("C");
		
		if(!v.isEmpty()){
			for(int i=0; i<v.size(); i++){
				System.out.println(v.get(i));
			}
			v.remove("A");
			System.out.println(v.size());
		}
	}

}