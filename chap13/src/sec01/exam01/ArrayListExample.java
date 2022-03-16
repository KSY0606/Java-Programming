package sec01.exam01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String>list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö ¾ò±â
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) { //  ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // 2¹ø ÀÎµ¦½º °´Ã¼ÀÎ database »èÁ¦
		list.remove(2); // 2¹ø ÀÎµ¦½º °´Ã¼ servlet/JSP »èÁ¦µÊ
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
