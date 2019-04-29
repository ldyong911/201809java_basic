package h_lang;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * 
		 * boolean	: Boolean
		 * char		: Character
		 * byte		: Byte
		 * short	: Short
		 * int		: Integer
		 * long		: Long
		 * float	: Float
		 * double	: Double
		 * 
		 */
		
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i + iw);	//iw 대신 iw.intValue()를 해야하지만
		                            //jdk 1.5버전부터 오토박싱&언박싱에 의해 자동으로 컴파일러 intValue()를 추가
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20")); //문자열을 기본형으로
		
		System.out.println(i + String.valueOf(20));
		
		System.out.println(i + Integer.valueOf("20")); //문자열을 래퍼 클래스로
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));
		v.add(10); //오토박싱 : 기본형타입이 wrapper클래스로 자동 변환
		
		int i2 = v.get(0);
		System.out.println(i2); //언박싱 : wrapper클래스가 기본형타입으로 자동 변환
		
		
	}

}