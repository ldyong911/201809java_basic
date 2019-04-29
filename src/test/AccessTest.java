package test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//상속을 받아도 상속받은 클래스로는 protected에 접근이 불가능하다.
		//상속을 받은 자기 클래스에서 접근해야 한다.
		AccessTest at = new AccessTest();
		at.proectedTest();
	}
	
	void proectedTest(){
		//다른 패키지에서 protected를 접근하려면 객체생성을 하지않고 자기자신의 변수, 메서드인 것처럼 사용해야 접근가능
		System.out.println(protectedVar);
		protectedMethod();
	}
}