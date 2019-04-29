package e_oop;

public class Restaurant {
	String[] menu = {"김밥", "라면", "떡볶이", "오뎅", "순대"};
	
	//메뉴판좀 주세요.
	String[] getMenu(){
		return menu;
	}
	
	//주문이요.
	String order(String foodName){
		boolean flag = false;
		
		for(int i=0; i<menu.length; i++){
			if(foodName.equals(menu[i])){
				flag = true;
			}
		}
		
		if(flag){
			return "조리된 " + foodName;
		}else{
			System.out.println(foodName + "? 그런거 안팔아요.");
			return null;
		}
		
	}
	
	//계산이요.
	void pay(int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히가세요");
		}
	}
	
}