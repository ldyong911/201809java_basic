package h_lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식(Regular Expression) : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작(^a)
		 * $	앞 문자로 종료(a$)
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상(a*)
		 * + 	앞 문자가 1개 이상(a+)
		 * ?	앞 문자가 없거나 1개(a?)
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것
		 * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * 
		 * https://regexr.com/
		 * 
		 */
		
//		Pattern p = Pattern.compile("[a-z]{3}[0-9]{1,3}");
//		Pattern p = Pattern.compile("[a-z0-9]+");
//		Pattern p = Pattern.compile("\\w*");
		Pattern p = Pattern.compile(".*");
		
		Matcher m = p.matcher("abc123");
		
		System.out.println(m.matches()); //true or false
		
		//아이디, 비밀번호, 전화번호, 이메일주소의
		//유효성을 검사하는 정규표현식을 만들어주세요.
		
		Pattern id = Pattern.compile("(?i)\\w{4,12}");
		Pattern pw = Pattern.compile("[a-zA-Z0-9!$^&*-]{5,15}");
		Pattern phone = Pattern.compile("0(10|1[6-9])-\\d{4}-\\d{4}");
		Pattern email = Pattern.compile("(?i)\\w{4,12}@(?i)[a-zA-Z]{1,10}\\.(?i)(com|net|co.kr|)$");
		
		Matcher mid = id.matcher("asdwe23");
		Matcher mpw = pw.matcher("a$sd^s213");
		Matcher mphone = phone.matcher("010-9442-1232");
		Matcher memail = email.matcher("ssdsd2@nadsc.com");
		
		System.out.println(mid.matches());
		System.out.println(mpw.matches());
		System.out.println(mphone.matches());
		System.out.println(memail.matches());
		
	}

}