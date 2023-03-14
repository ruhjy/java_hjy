package ch15.exercise.example07;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {

		BoardDao dao = new BoardDao();
//		List<Board> list = dao.getBoardList1();
		List<Board> list = dao.getBoardList2();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		System.out.println();

		List<Board> list3 = new ArrayList<>();
		List<Board> list4 = dao.getBoardList3(list3);
		for (Board board : list4) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}
}
