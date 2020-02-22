package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_list {

	public static void main(String[] args) {

		
		List<Integer> array_list_int = new ArrayList<>(); // ArrayList -> 검색할때 빠름.
		List<String> array_list_string = new ArrayList<>(); 
		List<Integer> linked_list_int = new LinkedList<Integer>(); // LinkedList -> 중간에 삽입, 삭제를 할 경우 빠름.
		
		array_list_int.add(1);
		array_list_int.add(2);
		array_list_int.add(6);

		array_list_string.add("one");
		array_list_string.add("two");
		array_list_string.add("three");
		array_list_string.add("four");
		
		// list_string.remove(3);
		
		for(int i = 0; i < array_list_int.size(); i++) {
			System.out.println(array_list_int.get(i));
		}
		
		for(int i = 0; i < array_list_string.size(); i++) {
			System.out.println(array_list_string.get(i));
		}
		
	}

}
