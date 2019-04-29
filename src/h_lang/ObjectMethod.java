package h_lang;

public class ObjectMethod extends Object{

	public static void main(String[] args) {
		//toString() : 객체에 대한 정보를 문자열로 제공한다.
		
		ObjectMethod om = new ObjectMethod();
		
		//패키지명클래스명@해시코드(16진수)
		System.out.println(om);
		System.out.println(om.toString());
	}
	
	@Override
	public String toString() { //toString의 접근제어자가 public인 이유는 Object클래스의 toString의 접근제어자가 public이라 
							   //오버라이딩시 부모메서드의 접근제어자보다 같거나 넓어야하기때문에 public이 올 수 밖에 없다.
		return "toString() 메서드 호출"; //super.toString();
	}
}