package f_oop2.ex_abstract;

public class Starcraft {
	
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		
	}
	
	//스팀팩을 사용
	void stimPack(){
		
	}
}

class Tank extends Unit{
	@Override
	void move(int x, int y) {
		
	}
	
	//시즈모드로 변환
	void changeMode(){
		
	}
	
}

class Dropship extends Unit{
	
	@Override
	void move(int x, int y) {
		
	}
	
	//선택된 대상을 태움
	void load(){
		
	}
	
	//선택된 대상을 내림
	void unload(){
		
	}
}

abstract class Unit{
	int x, y;  //현재 위치
	
	abstract void move(int x, int y);  //지정된 위치로 이동
	
	//현재 위치에서 정지
	void stop(){
		
	}
	
}