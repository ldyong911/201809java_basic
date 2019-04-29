package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * 1. 배열
		 * - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 
		 * 2. 배열의 선언
		 * - int[] number = new int[5]; //기본값으로 초기화된다.
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 * 
		 * 3. 배열의 사용
		 * - 변수명[인덱스](number[0])
		 * - 인덱스는 0부터 시작
		 * - 배열의 길이는 변수명.length(number.length)
		 * - 배열의 출력은 Arrays.toString();
		 * - 배열의 정렬은 Arrays.sort();
		 * - 배열의 복사는 System.arraycopy();
		 * - 향상된 for문 for(변수선언 : 배열){}
		 * 
		 */
		
		int[] numbers = new int[5];
		int numbers2[] = new int[]{1, 2, 3, 4, 5};
		int[] numbers3 = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = numbers[0] + numbers[1];
		numbers[3] = numbers[2] * 2;
		numbers[4] = numbers[3] > numbers[2] ? numbers[3] : numbers[2];
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = numbers.length - i;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int[] copyNumbers = new int[10];
		System.arraycopy(numbers, 0, copyNumbers, 0, 5);
		System.out.println(Arrays.toString(copyNumbers));
		
		for(int number : numbers){
			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 10; //numbers에 대입되지 않는다.
		}
		System.out.println(Arrays.toString(numbers));
			
		ArrayEx5();
		
		ArrayEx6();
		
		ArrayEx7();
		
		ArrayEx8();
		
		Math.random(); //0이상 1미만의 값을 반환
		
		//문제1. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		randomCount();
		
		//문제2. 1번의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		iuputRandomCount();
		
	}

	private static void iuputRandomCount() {
		int min = 0;
		int max = 0;
		int cycle = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("최소값: ");
		min = sc.nextInt();
		System.out.print("최대값: ");
		max = sc.nextInt();
		System.out.print("반복횟수: ");
		cycle = sc.nextInt();
		
		int[] arr = new int[max - min + 1];
		
		for(int i = 0; i < cycle; i++){
			int rand = (int)(Math.random() * (max-min+1) + min);
			System.out.print(rand);
			arr[rand-min] += 1;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println((i+min) + "번 = " + arr[i]);
		}
	}

	private static void randomCount() {
		int[] arr = new int[10];
		
		/*
		for(int i = 0; i < 500; i++){
			int n = (int)(Math.random() * 10 + 1);
			
			for(int j = 1; j <= 10; j++){
				if(n == j){
					arr[j-1] = arr[j-1]+1;
				}
			}
		}
		*/
		for(int i = 0; i < 500; i++){
			int n = (int)(Math.random() * 10 + 1);
			arr[n-1] += 1;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void ArrayEx8() {
		int[] num = new int[45];
		
		for(int i = 0; i < num.length; i++){
			num[i] = i + 1;
		}
		
		for(int i = 0; i < 6; i++){
			int n = (int)(Math.random() * 45);
			int temp = num[i];
			num[i] = num[n];
			num[n] = temp;
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}

	private static void ArrayEx7() {
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++){
			num[i] = i;
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++){
			int n = (int)(Math.random() * 10);
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i]);
		}
		System.out.println();
	}

	private static void ArrayEx6() {
		int[] score = {54, 23, 77, 68, 90};
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++){
			if(score[i] > max){
				max = score[i];
			}else if(score[i] < min){
				min = score[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}

	private static void ArrayEx5() {
		int sum = 0;
		float ave = 0f;
		
		int[] score = {100, 70, 90, 50, 60};
		
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		
		ave = sum / (float)score.length;
		
		System.out.println("점수의 합계는: " + sum);
		System.out.println("점수의 평균은: " + ave);
		
	}

}