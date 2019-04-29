package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * size()	: 저장된 객체의 수 반환
		 * remove()	: 지정된 위치의 객체를 제거
		 * 
		 */
		
		ArrayList<Object> list = new ArrayList<Object>(); //나중에 ArrayList에서 값을 꺼낼때 어떤 타입인지 모를 수 있기 때문에 안좋은 방법
		
		list.add(1);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		//----------------------------------------------------------------------
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
			list2.remove(i);
		}
		
		//----------------------------------------------------------------------
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); //int형 2차원 배열과 같은 형태
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		list3.add(al1);
		al1.add(10);
		al1.add(20);
		list3.get(0).add(30);
		
		System.out.println(list3);
		
		for(int i=0; i<list3.size(); i++){
			ArrayList<Integer> list4 = list3.get(i); //주소를 참조하기 때문에
			for(int j=0; j<list4.size(); j++){
				System.out.println(list4.get(j));
			}
//			list4.add(40); //list4가 가르키는 주소에 값이 더해짐
//			list4.add(50);
		}
		
	}
}