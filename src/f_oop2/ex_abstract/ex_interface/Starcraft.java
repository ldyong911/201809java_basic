package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		SCV scv = new SCV();
		scv.repair(tank);

	}

}

class Unit{
	int hp;  //현재 체력
	final int MAX_HP;  //최대 체력
	
	public Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	public Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	public Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	public Dropship() {
		super(125);
	}
}

class SCV extends Unit{
	public SCV() {
		super(60);
	}
	
	void repair(Repairable r){
		//Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		//hp를 멤버로 가진 unit으로 형변환을 해줘야 한다.
		if(r instanceof Unit){  //r에 인스턴스가 Unit에 인스턴스인지 확인
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
			System.out.println(u.hp);
		}
		
		
		//조상 참조변수 instanceof 자손 인스턴스 (무조건 O)
		//Object o instanceof 자손 인스턴스 (무조건 O)
		//빈 자손 Class를 만든다면 자손 참조변수 instanceof 조상 인스턴스 (가능함 O)
	}
}

interface Repairable{
	
}