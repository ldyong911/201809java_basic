package i_collection;

import java.util.ArrayList;

public class GradeClass {
	
	final static int MAX_PEOPLE = 24;
	final static int MAX_SUBJECT = 5;
	final static String[] NAME = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기", "김현지",
								  "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호", "윤한수", "이대용",
								  "이준호", "이한화", "임재우", "장구현", "진민규", "하준용", "한상호", "황수정"};
	
	ArrayList<ArrayList<Object>> plist = new ArrayList<ArrayList<Object>>();
	ArrayList<Object> clist = new ArrayList<Object>();
	
	void getCreate(){
		int hap=0;
		
		for(int i=0; i<MAX_PEOPLE; i++){
			plist.add(clist);
			clist = new ArrayList<Object>();
			
			hap = 0;
			plist.get(i).add(0, NAME[i]);
			for(int j=1; j<=MAX_SUBJECT; j++){
				plist.get(i).add(j, getRandom(50, 100));
				hap += (Integer)plist.get(i).get(j);
			}
			plist.get(i).add(MAX_SUBJECT+1, hap);
			plist.get(i).add(MAX_SUBJECT+2, hap/MAX_SUBJECT);
			plist.get(i).add(MAX_SUBJECT+3, 1);
			
		}
		
		getRank();
		getSort();
		getPrint2();
		getPrint();
	}
	
	void getRank(){
		for(int i=0; i<MAX_PEOPLE; i++){
			int rank = 1;
			for(int j=0; j<MAX_PEOPLE; j++){
				if((Integer)plist.get(i).get(6) < (Integer)plist.get(j).get(6)){
					rank++;
					plist.get(i).set(8, rank);
				}
			}
		}
	}
	
	void getSort(){
		ArrayList<Object> temp = new ArrayList<Object>();
		for(int i=0; i<MAX_PEOPLE-1; i++){
			for(int j=i+1; j<MAX_PEOPLE; j++){
				if((Integer)plist.get(i).get(8) > (Integer)plist.get(j).get(8)){
					temp = plist.get(i);
					plist.set(i, plist.get(j));
					plist.set(j, temp);
				}
			}
		}
	}
	
	void getPrint(){
		for(int i=0; i<MAX_PEOPLE; i++){
//			System.out.println(plist.get(i));
			for(int j=0; j<MAX_SUBJECT+4; j++){
				System.out.print(plist.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}
	
	int getRandom(int from, int to) {
		return (int) (Math.random() * (Math.abs(to - from)+1)) + Math.min(from, to);
	}
	
	void getPrint2(){
		ArrayList<Object> title = new ArrayList<Object>();
		title.add("이름");
		title.add("자바");
		title.add("Oracle");
		title.add("HTML");
		title.add("Jquery");
		title.add("JSP");
		title.add("총합");
		title.add("평균");
		title.add("석차");
		
		for(int i=0; i<title.size(); i++){
			System.out.print(title.get(i) + "\t");
		}
		System.out.println();
	}
}