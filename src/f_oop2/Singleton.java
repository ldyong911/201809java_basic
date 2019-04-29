package f_oop2;

//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴(속도향상이나 메모리절약을 할때 사용하기도 함)
public final class Singleton {
	
	private static Singleton instance;  //인스턴스를 사용하기전에 생성되어야하기 때문에 static이 붙음
	
	//생성자의 접근제어자가 private이기 때문에 다른 클래스가 상속받을 수 없다.
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){  //인스턴스를 사용하기전에 생성되어야하기 때문에 static이 붙음
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}