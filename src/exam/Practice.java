package exam;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("포르쉐", "Black", "Auto");

		int i=0;
		while(true){
			if(i > 100){
				break;
			}
			System.out.println(i);
			i++;
		}
		
		String arr = "12345";
		for(int j=0; j<arr.length(); j++){
			
		}
	}
}

class Car{
	String name;
	String color;
	String gear;
	int door;
	
	{
		name = "람보르기니";
		color = "White";
		gear = "Auto";
		door = 4;
	}
	
	Car(){
		System.out.println(name + " " + color + " " + gear + " " + door);
	}
	
	Car(String name, String color, String gear){
		this.name = name;
		this.color = color;
		this.gear = gear;
		System.out.println(this.name + " " + this.color + " " + this.gear + " " + this.door);
	}
	
}