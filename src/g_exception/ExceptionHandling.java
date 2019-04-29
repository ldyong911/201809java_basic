package g_exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 1. 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * 
		 * 2. 런타임 에러
		 * - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		 * - 런타임 에러가 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * 
		 * 3. 예외
		 * - 모든 예외는 Exception의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식 클래스외의 모든 예외는 예외처리가 강제된다.
		 * - 예외처리가 강제되는 예외는 'checked예외' 그렇지 않은 예외는 'unchecked예외'라고 한다.
		 * 
		 * 4. 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 * 
		 * 5. finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 6. 예외 발생시키기
		 * - throw new Exception();
		 * - throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 * 
		 * 7. 메서드에 예외 선언하기
		 * - void method() throws Exception() {}
		 * - 메서드의 구현부 끝에 throws 키워드와 예외 클래스로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 * 
		 * 8. 자동 자원 반환(try-with-resources)
		 * - try(변수선언;변수선언) {} catch(Exception e) {}
		 * - 사용 후 반환이 필요한 클래스를 try의 ()안에 선언하면 try 블럭 종료시 자동으로 반환된다.
		 * 
		 */
		
		
		try {
			int result = 10 / 0; //예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
			System.out.println(result); //예외 발생시 실행되지 않는다.
			
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			//예외 발생시 발생한 예외와 일치하는 catch 블럭이 수행되고
			//일치하는 catch가 없는 경우 예외는 처리되지 않는다.
			System.out.println("에러");
		} catch (NullPointerException e) { //지역변수이기 때문에 변수명 중복이 가능하다.
			//여러 종류의 예외를 처리하기 위해 catch를 하나 이상 사용할 수 있다.
			
		}
		
	}

}