package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * get()	: 지정된 키의 값을 반환(없으면 null)
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 * 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목");
		map.put("content", "내용");
		map.put("user", "사용자");
		
		map.remove("user");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		Iterator<String> itr2 = map.keySet().iterator();
		
		while(itr.hasNext()){ //읽어 올 요소가 남아있는지 확인해서 있으면 true, 없으면 false 반환
			String key = itr.next(); //다음 요소를 읽어 온다. 호출 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//------------------------------------------------------------------
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>(); //테이블 형태가 됨
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		list.add(hm);
		hm.put("java", "자바");
		hm.put("jsp", "제이에스피");
		
		list.get(0).put("db", "데이터베이스");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
			
			System.out.println(hm.get("java"));
			System.out.println(hm.get("db"));
			
			hm.put("key", "값");
			System.out.println(list.get(i).get("key"));
		}
		
		Iterator<HashMap<String, Object>> it = list.iterator();
		Set<String> ss = it.next().keySet();
		
		Iterator<String> ii = ss.iterator();
		
		while(ii.hasNext()){
			String key = ii.next();
			System.out.println(list.get(0).get(key));
		}
				
		
		//hm에 저장된 모든 내용 출력
		Set<String> keys2 = hm.keySet();
		Iterator<String> itr3 = keys2.iterator();
		Iterator<String> itr4 = hm.keySet().iterator();
		
		while(itr3.hasNext()){ //읽어 올 요소가 남아있는지 확인해서 있으면 true, 없으면 false 반환
			String key = itr3.next(); //다음 요소를 읽어 온다. 호출 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전
			String value = (String)hm.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
}