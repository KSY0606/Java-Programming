package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();  // 반복자 얻기
		while(iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 1개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JBDC"); // 객체 삭제 
		set.remove("IBATIS");
		
		System.out.println("총 객체 수: " + set.size()); 
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체를 제거
		if(set.isEmpty()) {System.out.println("비어있음");}
	}
}
