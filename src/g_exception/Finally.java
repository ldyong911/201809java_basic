package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			//Exception의 자식 예외들은 예외처리가 강제된다.
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //에러 발생시와 동일한 메시지를 출력한다.
			System.out.println(e.getMessage()); //에러 메시지를 반환한다.
		} finally{
			//예외 발생과 상관없이 반드시 처리해야 하는 내용을 넣어준다.
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				//예외와 일치하는 catch가 없으면 예외를 처리하지 못한다.
				//모든 예외를 처리하기 위해서는 Exception을 사용한다.
			}
		}
		
		//예외 발생 : try -> catch -> finally
		//예외 미발생 : try -> finally
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			//try() 안에서 객체를 생성하면 try 종료시 자동 반환된다.
			fos.write(68);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}