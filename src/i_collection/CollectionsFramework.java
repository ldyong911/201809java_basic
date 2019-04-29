package i_collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFramework {

	public static void main(String[] args) {
		/*
		 * 1. CollectionsFramework
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 * 
		 * 2. List
		 * - Vector		: ArrayList의 구버전
		 * - ArrayList	: 저장순서 유지, 중복 허용
		 * - LinkedList	: 데이터 추가 및 삭제시간 단축
		 * - Stack		: LIFO(Last In First Out)
		 * - Queue		: FIFO(First In First Out)
		 * 
		 * 3. Set
		 * - HashSet	: 중복 허용 안함, 저장순서 유지 안함
		 * - TreeSet	: 정렬, 검색 기능 향상
		 * 
		 * 4. Map
		 * - HashTable	: HashMap의 구버전
		 * - HashMap	: 키(key)와 값(value)을 한쌍으로 저장
		 * - TreeMap	: 정렬, 검색 기능 향상
		 * 
		 */
		
		GradeClass gc = new GradeClass();
		gc.getCreate();
		
		//숙제1. 우리반 모두의 Java, Oracle, HTML, Jquery, JSP 성적을 50 ~ 100까지 랜덤으로 생성시키고,
		//석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		
		scoreSort();
		
	}
	
	private static void scoreSort() {
		//학생이름
		ArrayList<String> students = new ArrayList<String>();
		//과목
		ArrayList<String> subjects = new ArrayList<String>();
		//과목별 점수
		ArrayList<ArrayList<Integer>> scores = new ArrayList<ArrayList<Integer>>();
		
		students.add("호날두");
		students.add("메시");
		students.add("네이마르");
		students.add("음바페");
		students.add("캉테");
		students.add("모드리치");
		students.add("베일");
		students.add("아센시오");
		students.add("아자르");
		students.add("외질");
		
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("Jquery");
		subjects.add("JSP");
		
		//점수를 입력한다.
		for(int i=0; i<students.size(); i++){
			ArrayList<Integer> score = new ArrayList<Integer>();
			score.add(1); //석차
			
			for(int j=0; j<subjects.size(); j++){
				score.add(getRandom(50, 100));
			}
			scores.add(score);
		}
		
		//총점과 평균을 구한다.
		for(int i=0; i<scores.size(); i++){
			ArrayList<Integer> score = scores.get(i);
			
			int total = 0; //총점
			
			for(int j=1; j<score.size(); j++){
				total += score.get(j);
			}
			
			score.add(total); //총점
			score.add(total / subjects.size()); //평균
			System.out.println(score);
		}
		
		//석차를 구한다.
		for(int i=0; i<scores.size(); i++){
			for(int j=0; j<scores.size(); j++){
				if(scores.get(i).get(subjects.size()+1) < scores.get(j).get(subjects.size()+1)){
					scores.get(i).set(0, scores.get(i).get(0) + 1);
				}
			}
		}
		
		//석차순으로 정렬한다.
		for(int i=0; i<scores.size(); i++){
			boolean changed = false;
			for(int j=0; j<scores.size()-1-i; j++){
				if(scores.get(j).get(0) > scores.get(j+1).get(0)){
					ArrayList<Integer> temp = scores.get(j);
					scores.set(j, scores.get(j+1));
					scores.set(j+1, temp);
					
					String tempName = students.get(j);
					students.set(j, students.get(j+1));
					students.set(j+1, tempName);
					
					changed = true;
				}
			}

			if(!changed){
				break;
			}
		}
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i=0; i<subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");
		
		for(int i=0; i<scores.size(); i++){
			ArrayList<Integer> score = scores.get(i);
			for(int j=0; j<score.size(); j++){
				System.out.print(score.get(j) + "\t");
				if(j == 0){
					System.out.print(students.get(i) + "\t");
				}
			}
			System.out.println();
		}
		
	}

	private static int getRandom(int from, int to) {
		return (int) (Math.random() * (Math.abs(to - from)+1)) + Math.min(from, to);
	}
}