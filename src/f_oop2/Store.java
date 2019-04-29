package f_oop2;

import java.util.Vector;


public class Store {

	public static void main(String[] args) {
		Customer c= new Customer();
		
		Desktop d = new Desktop();
		System.out.println(d.getInfo());
		
		Product l = new Laptop();
		System.out.println(l.getInfo());
		
		c.buy(d);
		System.out.println("남은돈: " + c.money + "원 / 포인트: " + c.point + "점");
		
		c.buy(l);
		System.out.println("남은돈: " + c.money + "원 / 포인트: " + c.point + "점");
		
		c.showItem();
		c.refund(l);
		c.showItem();
		
		//-----------------------------------------------------------------------
		
		//객체배열
		Product[] p = {new Desktop(), new Laptop()};
		Product[] p2 = new Product[2];
		p2[0] = new Desktop();
		p2[1] = new Laptop();
		
		Vector v = new Vector();  //동적으로 크기가 관리되는 객체배열
		System.out.println(v);
	}
	
}

//여러가지 물건들이 공통으로 상속받을 수 있는 클래스를 만든다.
class Product{
	int price;
	int point;
	
	//생성자에서 가격과 포인트를 초기화
	public Product(int price) {
		this.price = price;
		point = price/10;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return "가격: " + price + "원 / 포인트 : " + point + "점";
	}
	
}

class Desktop extends Product{
	public Desktop() {
		//부모 클래스의 생성자 호출
		super(1000);
	}
	
	//오버라이딩 메서드(오버라이딩을 하는이유는 이름을 알아보기 쉽게)
	@Override
	String getInfo(){
		return "Desktop - " + super.getInfo();  //부모 클래스의 메서드 호출
	}
	
	@Override
	public String toString(){
		return "Desktop";
	}
	
}

class Laptop extends Product{
	public Laptop() {
		//부모 클래스의 생성자 호출
		super(2000);
	}
	
	//오버라이딩 메서드(오버라이딩을 하는이유는 이름을 알아보기 쉽게)
	@Override
	String getInfo(){
		return "Laptop - " + super.getInfo();  //부모 클래스의 메서드 호출
	}
	
	@Override
	public String toString(){
		return "Laptop";
	}
}

class Customer{
	int money = 10000;  //명시적 초기화
	int point = 0;
	
	Vector<Product> item = new Vector<Product>();
	
	//구매할때 받을 파라미터의 타입으로 물건들의 부모클래스를 지정해주면
	//자식클래스 모두를 받을 수 있다.
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족하네ㅜㅜ");
			return;
		}
		
		money -= p.price;
		point += p.point;
		
		item.add(p);

		System.out.println(p + "!! 득템 !!");  //p를 찍으면 toString()이 실행되어 객체가 출력되므로
		                                      //원하는 결과값을 얻으려면 toString()을 다시 작성해야한다.
	}
	
	//문제1. 환불하는 메서드를 만들어주세요.
	void refund(Product p){
		if(item.remove(p)){
			System.out.println("환불되었습니다.");
			money += p.price;
			point -= p.point;
		}
	}
	
	void showItem(){
		String items = "아이템 목록: ";
		
		for(Product item : this.item){
			items += " " + item;
		}
		System.out.println(items);
	}
	
}