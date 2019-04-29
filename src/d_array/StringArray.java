package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		/*
		 * 1. String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 확인한다.
		 * - toCharArray() : 문자열을 문자배열로 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 문자열에서 해당 인덱스에 있는 문자를 반환한다.
		 * - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * - split() : 문자열을 특정 문자열을 기준으로 나누어 배열로 반환한다.
		 * - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 * 
		 */
		
		String str = "abcd,efg";
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		for(int i=0; i<str.length(); i++){
			System.out.println(str.charAt(i));
		}
		
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(1, 4));
		
		System.out.println(str.substring(0, str.indexOf(",")));
		System.out.println(str.substring(0, str.lastIndexOf(",")));
		
		String[] split = str.split(",");
		
		System.out.println(Arrays.toString(split));
		
		System.out.println(str.replace("efg", "abcd"));
		
		for(String arg : args){
			System.out.println(arg);
		}
		
		//문제1. 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		setComma();
		
		//문제2. 하이픈(-)이 있는 전화번호를 입력받아 하이픈을 제거해 출력해주세요.
		removeHyphen();
		
		//문제3. 하이픈(-)이 없는 전화번호를 입력받아 하이픈을 삽입해 출력해주세요.
		setHyphen();
		
	}

	private static void setHyphen() {
		String phone = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰번호를 - 없게 입력하세요: ");
		phone = sc.nextLine();
		String result = "";
		
		for(int i=0; i<phone.length(); i++){
			if(i==2 || i==6){
				result += phone.charAt(i) + "-";
			}else{
				result += phone.charAt(i);
			}
		}
		System.out.println(result);
		
	}

	private static void removeHyphen() {
		String phone = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰번호를 - 있게 입력하세요: ");
		phone = sc.nextLine();
		
		String[] split = phone.split("-");
		String result = "";
		
		for(int i=0; i<3; i++){
			result += split[i];
		}
		System.out.println(result);
		
	}

	private static void setComma() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String number = sc.nextLine();
		String newNumber = "";
		
		int cnt = 0;
		
		for(int i=number.length()-1; i>=0; i--){
			newNumber = number.charAt(i) + newNumber; //뒤에서 앞으로 더하기
			cnt++;
			
			if(cnt%3 == 0 && cnt != number.length()){
				newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);
		
		/*
		String num="";
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		num = sc.nextLine();
		
		String[] numArray = new String[num.length()];
		String result="";
		
		int j = num.length(); //거꾸로 저장하기위해
		
		for(int i=0; i<num.length(); i++){
			j--;
			numArray[i] = Character.toString(num.charAt(j));
			
			if((i+1)%3 == 0){ //3자리수마다 콤마
				if(i == num.length()-1){ //제일 첫번째는 콤마가 오지않는다
					result += numArray[i];
				}else{
					result += numArray[i] + ",";
				}
			}
			else{
				result += numArray[i];
			}
		}
		System.out.println(result);
		
		for(int i=result.length()-1; i>=0; i--){
			System.out.print(result.charAt(i));
		}
		System.out.println();
		*/
		
	}

}