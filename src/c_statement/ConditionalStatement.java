package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 1. 조건문
		 * - if, switch
		 * - 조건식과 문장을 포함할 수 있는 블럭{}으로 구성되어있다.
		 * - 조건식의 연산결과에 따라 수행할 문장이 달라져 프로그램의 흐름을 변경할 수 있다.
		 * 
		 * 2. if문
		 * - 조건식의 값이 반드시 boolean형 값이 되어야 한다.
		 * - 조건식의 값이 true인 경우 {}안의 문장을 수행한 후 if문을 빠져나온다.
		 * - 경우의 수가 여럿일 경우 if문의 뒤에 else혹은 else if를 추가해 한세트로 사용할 수 있다.
		 * - {}안의 문장이 한문장일 경우 {}를 생략할 수 있다.(왠만하면 생략하지 말자.)
		 * 
		 * 3. switch문
		 * - 조건식이 1개 이다.
		 * - 조건식의 값은 정수형 또는 문자열(JDK1.7버전 부터)이어야 한다.
		 * - 조건식의 값과 일치하는 case문 이후의 문장을 수행한다.
		 * - break를 만나면 switch문을 빠져나온다.
		 * - case문의 값은 중복되지 않아야 한다.
		 * - 조건식의 값과 일치하는 case문이 없는 경우에는 default문을 수행한다.
		 */
		
		int i = 3;
		
		if(i == 0){
			System.out.println("영");
		}
		else if(i ==1 || i ==2){
			System.out.println("일 이거나 이");
		}
		else{
			System.out.println("나머지");
		}
		
		if(i != 0)
			System.out.println("영이 아니다");
		else if(i < 1)
			System.out.println("일보다 작다");
		else
			System.out.println("일보다 크다");
		
		String str1 = "abcd";
		String str2 = "abc";
		
		if(str1.equals(str2)) System.out.println("같다");
		else if(!str1.equals(str2)) System.out.println("같지 않다");
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("입력>");
		String str = sc.nextLine();
		System.out.println("입력받은 내용 : " + str);
		int num = sc.nextInt();
		System.out.println("입력받은 내용: " + num);*/
		
//		grading();
		
//		gradingUpgrade();
		
		int month = 9;
		String season = "";
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default:
			break;
		}
		System.out.println(season);
		
		switgrade();
		
		boolean flag = true;
		int num1=0, num2=0;
		while(flag){
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			
			if(num1 + num2 == 6){
				System.out.println(num1 + "," + num2);
			}
		}
	}
	
	private static void switgrade() {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수 입력: ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("당신의 등급은: " + grade);
		
	}

	private static void gradingUpgrade() {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력: ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.println("당신의 점수는: " + score);
		
		if(score >= 90){
			grade = 'A';
			if(score >= 98){
				opt = '+';
			}else if(score < 94){
				opt = '-';
			}
		}else if(score >= 80){
			grade = 'B';
			if(score >= 88){
				opt = '+';
			}else if(score < 84){
				opt = '-';
			}
		}else{
			grade = 'F';
		}
		
		System.out.println("당신의 등급은: "+ grade + opt);
		
	}

	private static void grading() {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수입력: ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score >= 90){
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("등급은: " + grade);
		
	}

}