package ch15.lecture.p05queue;

import java.util.*;

public class C01Queue {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		// offer : 새 아이템 삽입
		queue.offer("kang");
		// poll : 기존 아이템 삭제(꺼내기)
		String poll = queue.poll();
		System.out.println("poll : " + poll);
		int size = queue.size();
		System.out.println("size : " + size);
		System.out.println();

		queue.offer("chae");
		queue.offer("song");
		queue.offer("jeong");
		queue.offer("seo");
		System.out.println("size : " + queue.size());
		System.out.println("poll : " + queue.poll());
		System.out.println("size : " + queue.size());
		System.out.println();
		
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}
}
