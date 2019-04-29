package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 1. 다차원 배열
		 * - 배열안에 배열을 가지고 있는 형태이다.
		 * - 2차원 배열은 테이블 형태이다.
		 * 
		 */
		
		int[][] numbers = new int[2][3];
		int numbers2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] numbers3[] = { {1, 2, 3}
						   , {4, 5, 6}
						   , {7, 8, 9} };
		
		int[][] numbers4 = new int[3][];
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10];
		
		numbers[0][0] = 0;
		numbers[0][1] = 1;
		numbers[0][2] = 2;
		numbers[1][0] = 10;
		numbers[1][1] = 11;
		numbers[1][2] = 12;
		
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++){  //2차원 배열에 접근하기 위해서는 1차원 배열에 먼저 접근해야 가능
			System.out.println(Arrays.toString(numbers[i]));
		}
		
		for(int[] numberArr : numbers){
			for(int number : numberArr){
				System.out.println(number);
			}
		}
		
		//문제1. 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 성적을 50 ~ 100까지 랜덤으로 생성시키고,
		//  1-1) 이름, 성적, 총점, 평균, 석차를 출력해주세요.
		scoreRank();
		//  1-2) 석차순으로 석차, 이름, 성적, 총점, 평균을 출력해주세요.
		scoreSort();
		
	}

	private static void scoreSort() {
		String[] subject = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		String[] student = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기", "김현지",
						    "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호", "윤한수", "이대용",
						    "이준호", "이한화", "임재우", "장구현", "진민규", "하준용", "한상호", "황수정",};
		int[][] score = new int[student.length][subject.length + 3];
		
		//점수생성, 총점, 평균 구하기
		for(int i=0; i<student.length; i++){
			for(int j=0; j<subject.length; j++){
				score[i][j] = (int)(Math.random() * 51 + 50); //(최대값-최소값+1)+최소값
				score[i][5] += score[i][j];
			}
			score[i][6] = score[i][5] / (score[i].length-3);
		}
		
		//석차 구하기
		for(int i=0; i<score.length; i++){
			score[i][7] = 1;
			for(int j=0; j<score.length; j++){
				if(score[i][5] < score[j][5]){
					score[i][7]++;
				}
			}
		}
		
		//정렬하기
		int[] temp = {0};
		String temp2 = "";
		
		for(int i=0; i<score.length-1; i++){
			for(int j=i+1; j<score.length; j++){
				if(score[i][7] > score[j][7]){
					temp = score[i];	//2차원배열은 배열 한행을 한번에 옮길수 있음
					score[i] = score[j];
					score[j] = temp;
					
					temp2 = student[i];
					student[i] = student[j];
					student[j] = temp2;
				}
			}
		}
		
		//출력하기
		System.out.print("석차\t이름\t");
		for(int i=0; i<subject.length; i++){
			System.out.print(subject[i] + "\t");
		}
		System.out.print("총점\t평균\t\n");
		
		for(int i=0; i<score.length; i++){
			System.out.print(score[i][7] + "\t" + student[i] + "\t");
			for(int j=0; j<score[i].length-1; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void scoreRank() {
		String[] subject = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		String[] student = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기", "김현지",
						    "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호", "윤한수", "이대용",
						    "이준호", "이한화", "임재우", "장구현", "진민규", "하준용", "한상호", "황수정",};
		int[][] score = new int[student.length][subject.length + 3];
		
		//점수생성, 총점, 평균 구하기
		for(int i=0; i<student.length; i++){
			for(int j=0; j<subject.length; j++){
				score[i][j] = (int)(Math.random() * 51 + 50); //(최대값-최소값+1)+최소값
				score[i][5] += score[i][j];
			}
			score[i][6] = score[i][5] / (score[i].length-3);
		}
		
		//석차 구하기
		for(int i=0; i<score.length; i++){
			score[i][7] = 1;
			for(int j=0; j<score.length; j++){
				if(score[i][5] < score[j][5]){
					score[i][7]++;
				}
			}
		}
		
		//출력하기
		System.out.print("이름\t");
		for(int i=0; i<subject.length; i++){
			System.out.print(subject[i] + "\t");
		}
		System.out.print("총점\t평균\t석차\t\n");
		
		for(int i=0; i<score.length; i++){
			System.out.print(student[i] + "\t");
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}