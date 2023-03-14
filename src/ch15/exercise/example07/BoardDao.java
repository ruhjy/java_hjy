package ch15.exercise.example07;

import java.util.*;

public class BoardDao {

	private List<Board> list = new ArrayList<>();

	public BoardDao() {
	}

	public List<Board> getBoardList1() {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}

	public List<Board> getBoardList2() {
		List<Board> list2 = new ArrayList<>();
		list2.add(new Board("제목1", "내용1"));
		list2.add(new Board("제목2", "내용2"));
		list2.add(new Board("제목3", "내용3"));
		return list2;
	}

	public List<Board> getBoardList3(List<Board> list) {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
}
