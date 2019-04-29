package e_oop;

import java.util.Arrays;

public class OOPetc {

	public static void main(String[] args) {
		/*
		 * 1. 생성자
		 * - 클래스명과 동일한 이름의 메서드는 생성자이다.
		 * - 클래스에는 하나 이상의 생성자가 있어야 한다.
		 * - 생성자는 직접 만들 수 있고, 만들지 않으면 컴파일러가 기본 생성자를 만들어준다.
		 * - 생성자는 인스턴스 변수를 초기화하거나 인스턴스 생성시에 실행되어야 할 작업을 위해서 사용된다.
		 * - 생성자는 리턴값이 없다.
		 * 
		 * 2. 초기화 블럭
		 * - [static] {}
		 * - 멤버변수의 초기화를 위한 블럭이다.
		 * - 변수의 명시적 초기화 -> 초기화 블럭 -> 생성자 순으로 실행된다.
		 * 
		 * 3. 오버로딩
		 * - 매개변수의 갯수나 타입이 다르다면 메서드명은 중복될 수 있다.
		 * - 리턴타입도 다를 수 있지만 리턴타입만 다른 오버로딩은 허용되지 않는다.
		 * 
		 * 4. this, this()
		 * - 클래스명 대신 사용된다.
		 * - this는 전역변수와 지역변수를 구분하기 위해 사용한다.
		 * - this()는 생성자에서 다른 생성자를 호출하기 위해 사용한다.
		 * - this()는 생성자의 첫줄에서만 사용할 수 있다.
		 * 
		 * 5. static
		 * - 전역변수와 메서드에 붙일 수 있다.
		 * - 객체를 생성하지 않아도 메모리에 올라가 있어 클래스명.으로 바로 접근할 수 있다.
		 * - static이 붙은 변수를 클래스 변수, 메서드를 클래스 메서드 라고 한다.
		 * - static이 붙지 않은 변수를 인스턴스 변수, 메서드를 인스턴스 메서드라고 한다.
		 * - 클래스 변수는 생성된 객체와 별개의 메모리를 사용하여 객체의 생성에 영향을 받지 않고, 객체들이 공유해서 사용할 수 있다.
		 * - 클래스 메서드에서 인스턴스 변수나 인스턴스 메서드를 사용하기 위해서는 인스턴스화를 해야한다.
		 * 
		 * 6. JVM 메모리 구조
		 * - 메서드 영역(method area) : 클래스에 대한 정보를 저장한다.
		 * - 힙(heap) : 인스턴스(객체)가 저장된다.
		 * - 호출스택(call stack) : 호출된 메서드가 저장된다.
		 * 
		 * 7. 재귀호출
		 * - 메서드 내에서 메서드 자신을 호출하는 것이다.
		 * - 재귀호출을 하는 메서드를 재귀 메서드라고 한다.
		 * - 무한반복을 벗어나기 위한 조건이 있어야 한다.
		 * 
		 */
		
		String[] restaurants = RestaurantGroup.restaurants;
		String[][] menus = RestaurantGroup.menus;
		
		for(int i=0; i<restaurants.length; i++){
			System.out.println(restaurants[i] + " : " + Arrays.toString(menus[i]));
		}
		
		RestaurantGroup rg1 = new RestaurantGroup("분식집");
		RestaurantGroup rg2 = new RestaurantGroup("중국집");
		RestaurantGroup rg3 = new RestaurantGroup("버거집");
		
		String[] menu1 = rg1.getMenu();
		String[] menu2 = rg2.getMenu();
		String[] menu3 = rg3.getMenu();
		
		System.out.println(Arrays.toString(menu1));
		System.out.println(Arrays.toString(menu2));
		System.out.println(Arrays.toString(menu3));
		
		String[] order = rg3.order(new String[]{"와퍼", "사이다", "감자튀김"});
		
		System.out.println(Arrays.toString(order));
		
		rg3.pay(2000);
		
		System.out.println(rg1.ceo);
		System.out.println(rg2.ceo);
		System.out.println(rg3.ceo);
		
		rg1.ceo = "김도현";

		System.out.println(rg1.ceo);
		System.out.println(rg2.ceo);
		System.out.println(rg3.ceo);
		
		//객체로 접근하면 인스턴스 멤버라고 생각할 수 있으므로 클래스 멤버는 반드시 클래스로 접근하도록 하자
		System.out.println(RestaurantGroup.ceo);
		
	}

}