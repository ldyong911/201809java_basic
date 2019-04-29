package e_oop;

public class OOPtest {

	public static void main(String[] args) {
		//문제1. TV라는 클래스를 생성해 전원상태, 채널, 음량을 변경하는 메서드를 만들어주세요. (생성시 TV이름 지정)
		TV tv = new TV("삼성 LED TV");
		
		tv.changePower();
		
		tv.changeChannel(50);
		tv.changeUpChannel();
		tv.changeDownChannel();
		
		tv.changeUpVolume();
		tv.changeDownVolume();
		
		//문제2. TV클래스를 사용해서 두대의 TV를 생성하고, 두대의 채널과 음량 상태를 각각 3번 이상씩 변경해주세요.
		TV tv1 = new TV("LG 아몰레드");
		TV tv2 = new TV("삼성 판타스틱");
		
		tv1.changePower();
		
		for(int i=0; i<3; i++){
			tv1.changeUpChannel();
			tv1.changeUpVolume();
			tv2.changeUpChannel();
			tv2.changeUpVolume();
		}
		
		tv1.changeChannel(100);
		tv2.changeChannel(100);
	}

}

class TV{
	private String name;
	private boolean power;
	private int channel;
	private int volume;
	
	private final int MAX_CHANNEL;
	private final int MIN_CHANNEL;
	private final int MAX_VOLUME;
	private final int MIN_VOLUME;
	
	{
		MAX_CHANNEL = 100;
		MIN_CHANNEL = 1;
		MAX_VOLUME = 100;
		MIN_VOLUME = 0;
	}
	
	TV(String name){
		this.name = name;
		power = false;
		channel = 1;
		volume = 0;
	}
	
	void changePower(){
		power = !power;
		if(power){
			System.out.println("켜짐");
		}else{
			System.out.println("꺼짐");
		}
		
		printState();
	}
	
	void changeChannel(int channel){
		if(power){
			if(0 < channel && channel <= 100){
				this.channel = channel;
			}
		}else{
			printNoPower();
		}
		
		printState();
	}
	
	void changeUpChannel(){
		if(power){
			changeChannel(channel + 1);
		}else{
			printNoPower();
		}
		
		printState();
	}
	
	void changeDownChannel(){
		if(power){
			changeChannel(channel - 1);
		}else{
			printNoPower();
		}
		
		printState();
	}
	
	void changeUpVolume(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
		}else{
			printNoPower();
		}
		
		printState();
	}
	
	void changeDownVolume(){
		if(power){
			if(volume > MIN_VOLUME){
				volume--;
			}
		}else{
			printNoPower();
		}
		
		printState();
	}
	
	void printState(){
		System.out.println(name + "의 상태(전원: " + power + " 채널: " + channel + " 음량: " + volume + ")");
	}
	
	void printNoPower(){
		System.out.println("아직 TV 전원이 켜지지 않았습니다.");
	}
	
}