package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}

	private static int factorial(int i) {
		int result = 0;
		
		if (i == 1){
			result = 1;
		}else{
			result = i * factorial(i-1);
		}
		return result;
	}

}