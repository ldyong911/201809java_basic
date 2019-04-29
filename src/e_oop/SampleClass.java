package e_oop; //패키지명은 첫글자는 소문자

import java.util.Arrays;

public class SampleClass {
	int field = 1; //필드, 멤버변수, 전역변수
	
	//기본적인 메서드
	void method1(){
		Arrays.toString(new int[0]);
	}
	
	//명령의 수행에 필요한 정보: 매개변수, 아규먼트, 파라미터
	void method2(int parameter){
		parameter += 2;
	}
	
	//명령 수행 후 결과를 돌려주는 것: 반환타입, 리턴타입
	String method3(){
		return "받아라!!";
	}
	
	//파라미터와 리턴타입이 모두 있는 메서드
	int method4(int parameter){
		parameter += field;
		return parameter;
	}
	
}