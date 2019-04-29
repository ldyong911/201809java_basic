package f_oop2;

import f_oop2.Outer.InstanceInner;
import f_oop2.Outer.StaticInner;

public class InnerClass {

	public static void main(String[] args) {
		InstanceInner ii = new Outer().new InstanceInner();
		
		System.out.println(Outer.StaticInner.inner3);
		
		StaticInner si = new Outer.StaticInner();
		System.out.println(si.inner2);
	}

}

class Outer{
	//인스턴스 변수
	int instanceVar = 1;
	int var = 10;
	
	//인스턴스 클래스
	class InstanceInner{
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30;
			
			System.out.println(var);  //지역 변수
			System.out.println(this.var); //전역 변수
			System.out.println(Outer.this.var); //외부 클래스 변수
		}
	}
	
	//클래스 변수
	static int classVar = 2;
	
	//스태틱 클래스
	static class StaticInner{
		//int inner1 = instanceVar; //스태틱 클래스에서는 클래스 멤버만 사용 가능
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	void method(){
		//지역 변수
		int localVar1 = 3; //JDK1.8 부터는 지역 클래스가 참조하는 변수에 컴파일러가 자동으로 final을 붙여줌
		final int localVar2 = 4;
		
		//지역 클래스
		class LocalInner{
			//지역 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능하고
			//final이 붙은 지역 변수도 사용 가능
			int inner1 = instanceVar;
			int inner2 = classVar;
			//int inner3 = localVar1; //final이 붙지 않은 지역 변수는 사용 불가
			int inner4 = localVar2;
		}
		
		//지역 클래스는 메서드 내부에서 인스턴스화를 통해 사용 가능
		LocalInner li = new LocalInner();
		
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
	}
	
	void test1(){
		//인스턴스 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		//클래스 멤버는 클래스를 통해서 바로 접근할 수 있는 것과 같이
		//스태틱 클래스는 클래스를 통해서 바로 접근할 수 있다.
		System.out.println(StaticInner.inner3);
		
		//스태틱 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		StaticInner si = new Outer.StaticInner();
		System.out.println(si.inner2);
	}
	
	static void test2(){
		Outer o = new Outer();
		InstanceInner ii = o.new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		System.out.println(StaticInner.inner3);
		StaticInner si = new Outer.StaticInner();
		System.out.println(si.inner2);
		
	}
	
}