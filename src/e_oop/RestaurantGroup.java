package e_oop;

public class RestaurantGroup {
	
	static String ceo = "김승섭";  //명시적 초기화(1번째 순위)
	
	static String[] restaurants;  //체인점 목록
	static String[][] menus;  //체인점들 메뉴 목록
	String[] menu;  //선택한 체인점 메뉴
	
	static {
		//초기화 블럭을 통한 초기화(2번째 순위)
		restaurants = new String[]{"분식집", "중국집", "버거집"};
		
		menus = new String[3][];
		menus[0] = new String[]{"김밥", "라면", "떡볶이", "오뎅", "순대"};
		menus[1] = new String[]{"짜장면", "짬뽕", "볶음밥", "탕수육"};
		menus[2] = new String[]{"불고기버거", "와퍼", "상하이버거", "콜라", "사이다", "감자튀김"};
	}
	
	//생성자는 인스턴스 변수를 초기화하거나 인스턴스화 할때 필요한 작업을 위해 사용한다.
	RestaurantGroup(String name){
		//생성자를 통한 초기화(3번째 순위)
		if(name.equals("분식집")){
			menu = menus[0];
		}else if(name.equals("중국집")){
			menu = menus[1];			
		}else if(name.equals("버거집")){
			menu = menus[2];			
		}
	}
	
	//같은 이름의 메서드를 여러개 만드는 것을 오버로딩이라 한다. 단, 매개변수 갯수나 타입이 달라야한다.
	RestaurantGroup(){
		this("버거집");  //생성자에서 생성자를 호출 할때는 반드시 this()를 사용한다.
	}
	
	
	//메뉴판 좀 주세요.
	String[] getMenu(){
		return menu;
	}
	
	//주문이요.
	String order(String menu){
		boolean flag = false;
		
		for(int i=0; i<this.menu.length; i++){
			if(menu.equals(this.menu[i])){
				flag = true;
			}
		}
		
		if(flag){
			return "조리된 " + menu;
		}else{
			System.out.println(menu + "? 그런거 안팔아요.");
			return null;
		}
	}
	
	String[] order(String[] menu){
		boolean[] flag = new boolean[menu.length];
		String[] rtnMenu = new String[menu.length];
		
		for(int i=0; i<menu.length; i++){
			for(int j=0; j<this.menu.length; j++){
				if(menu[i].equals(this.menu[j])){
					flag[i] = true;
				}
			}
		}
		
		for(int i=0; i<flag.length; i++){
			if(flag[i]){
				rtnMenu[i] = "조리된 " + menu[i];
			}else{
				System.out.println(menu[i] + "? 그런거 안팔아요.");
			}
		}
		
		return rtnMenu;
	}
	
	//계산이요.
	void pay(int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히 가세요.");
		}
	}
	
}