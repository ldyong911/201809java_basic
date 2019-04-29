package f_oop2;

public class SampleParent extends Object{  //상속받지 않는 모든 클래스는 Object 클래스를 상속받는다
	
	String parentVariable;
	String var;
	int n;
	
	public SampleParent(String param) {
		super();  //Object 클래스의 생성자 호출(컴파일러가 자동으로 넣어줌)
		parentVariable = param;
	}
	public SampleParent() {
		//생성자에서 다른 생성자를 호출할때는 this()를 사용한다.
		this("부모 변수");
	}
	
	void parentMethod(){
		System.out.println("부모 메서드");
	}
}