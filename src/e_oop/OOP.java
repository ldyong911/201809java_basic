package e_oop;

import java.util.Arrays;
import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 1. 객체지향 프로그래밍
		 * - 실세계를 모델로 프로그래밍하는 방식
		 * - 사람, 사물 : 클래스
		 * - 행동, 동작 : 메서드
		 * 
		 * 2. 클래스의 구성
		 * - 클래스 파일의 가장 첫줄에는 페키지(package)를 선언한다.
		 * - 패키지와 클래스 선언 사이에 임포트(import)를 선언한다.
		 * - [제어자] class 클래스명 [상속] {}
		 * - 변수와 메서드로 구성할 수 있다.
		 * 
		 * 3. 전역변수와 지역변수
		 * - 위치에 따라 전역변수와 지역변수로 나누어진다.
		 * - 메서드 밖에 있는 변수는 전역변수로 모든 메서드가 사용할 수 있다.
		 * - 메서드 안에 있는 변수는 지역변수로 해당 메서드안에서만 사용할 수 있다.
		 * 
		 * 4. 메서드
		 * - [제어자] 리턴타입 메서드명([매개변수]) {return;}
		 * - 메서드명([인자]); -> 메서드 호출 결과 리턴값 존재시 리턴값 반환
		 * - 참조형 매개변수는 메서드에서 수행한 연산이 변수에 반영된다.
		 * - 메서드는 리턴을 만나면 종료된다.
		 * 
		 * 5. 객체 생성(인스턴스화)
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 * - 객체를 저장한 변수뒤에 점(.)을 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		
		Restaurant r = new Restaurant();  //객체 생성(인스턴스화)
		
		String[] menu = r.getMenu();  //리턴타입이 있는 메서드 호출
		
		System.out.println(Arrays.toString(menu));
		
		String order1 = r.order(menu[2]);  //파라미터와 리턴타입이 모두 있는 메서드 호출
		System.out.println(order1);
		
		String order2 = r.order("스테이크 덮밥");
		System.out.println(order2);
		
		r.pay(100);  //파라미터가 있는 메서드 호출
		
		r.menu[0] = "스테이크 덮밥";
		System.out.println(Arrays.toString(menu));
		
		//문제1. Calculator 클래스에 두개의 숫자를 받아서 더하기, 빼기, 곱하기, 나누기, 나머지를 연산한 결과를 반환하는 메서드를 만들어주세요.
		
		//문제2. Calculator 클래스를 사용해 다음을 계산해주세요.
		Calculator c = new Calculator();
		double x = 123456;
		double y = 654321;
		double res = c.add(x, y);
		res = c.mul(res, x);
		res = c.div(res, x);
		res = c.sub(res, y);
		res = c.remain(res, x);
		
		System.out.println(res);
		
		//객체 배열
		Restaurant[] rt = new Restaurant[2];  //참조형 배열의 기본값은 null이다.
		Restaurant[] rt2 = new Restaurant[]{new Restaurant(), new Restaurant()};
		Restaurant[] rt3 = {new Restaurant(), new Restaurant()};
		
		rt[0] = new Restaurant();
		rt[1] = new Restaurant();
		
		rt[0].getMenu();
		String[] menu2 = rt[0].getMenu();
		System.out.println(Arrays.toString(menu2));
		
		//참조형 파라미터
		int callTest1 = 0;
		System.out.println(callTest1);
		callTest1(callTest1);
		System.out.println(callTest1);
		
		Restaurant callTest2 = new Restaurant();
		System.out.println(Arrays.toString(callTest2.getMenu()));
		callTest2(callTest2);
		System.out.println(Arrays.toString(callTest2.getMenu()));
		
		
		/*
		//숙제1. 현실에 존재하는 무엇이든 대상을 정해 그 대상을 1개의 클래스로 만들어주세요.
		
		//숙제2. 숙제1에서 만든 클래스의 객체를 생성하고 메서드들을 호출해주세요.
		WaterPark_11 wp = new WaterPark_11();
		String[][] product = wp.getProduct();
		Scanner sc = new Scanner(System.in);
		int money = 100000;
		
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		money -= wp.buyTicket(age);
		
		System.out.println("-------대여물품--------");
		for(int i=0; i<product.length; i++){
			System.out.print(product[i][0] + "  ");
		}
		System.out.println("\n---------------------");
		
		System.out.print("대여물품입력: ");
		String borrow = sc.next();
		
		money -= wp.buyProduct(borrow);
		System.out.println("거스름돈 " + money + "원 입니다.");
		*/
		
	}

	private static void callTest2(Restaurant callTest2) {  //주소가 복사되므로 같은 주소이기때문에 같은 객체를 향하므로 변경된다.
		callTest2.menu[0] = "스테이크 덮밥";
	}

	private static void callTest1(int callTest1) {  //값이 복사되므로 변경되지 않는다
		callTest1 = 1;
	}

}