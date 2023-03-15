package ch15.exercise.example09;

import java.util.*;
import java.util.Map.*;

public class MapExample {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			totalScore += map.get(key);
		}

		System.out.println("평균 점수: " + totalScore / map.size());

		for (String key : keySet) {
			int score = map.get(key);
			if (maxScore < score) {
				maxScore = score;
			}
		}

		System.out.println("최고 점수: " + maxScore);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (maxScore == entry.getValue()) {
				System.out.println("최고 점수를 받은 아이디: " + entry.getValue());
			}
		}

	}
}