package ch15.lecture.p01list;

import java.util.*;

class C01List {
	// java.util.List
	// 순서가 있는 컬렉션
	// 각 아이템(element, 원소)는 index로 접근 가능
	
	public static void main(String[] args) {
		// 새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		// element 추가 add()
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		// element 얻기 get()
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		// list 크기 size()
		int size = list.size(); // 4
		
		// 특정 index의 element 지우기 remove()
		// 지운 후 오른쪽의 값이 왼쪽에 채워짐
		list.remove(2);
		
		System.out.println("지운 후 크기 : " + list.size()); // 3
		System.out.println("지운 후 2번index의 값 : " + list.get(2)); // "java"
		
		// 특정 index의 값 바꾸기 set()
		list.set(2, "react");
		System.out.println(list.get(2)); // "react"
	}
	
}
