package e_oop;

public class WaterPark_11 {
	
	int[] ticket = {30000, 15000};
	String[][] product = {{"구명조끼", "10000"},
						  {"아쿠아슈즈", "5000"},
	                      {"모자", "3000"}};
	int price = 0;
	
	//티켓 구매하기
	int buyTicket(int age){
		if(13 <= age){
			System.out.println("대인은 30000원 입니다.");
			return ticket[0];
		}else{
			System.out.println("소인은 15000원 입니다.");
			return ticket[1];
		}
	}
	
	//물품
	String[][] getProduct(){
		return product;
	}
	
	//물품 대여하기
	int buyProduct(String productName){
		boolean flag = false;
		
		for(int i=0; i<product.length; i++){
			if(productName.equals(product[i][0])){
				System.out.println(productName + " 대여료는 " + product[i][1] + "원 입니다.");
				price = Integer.parseInt(product[i][1]);  //String을 int로
				flag = true;
			}
		}
		
		if(flag){
			return price;
		}else{
			System.out.println(productName + " 상품은 없습니다.");
			return 0;
		}
		
	}

}