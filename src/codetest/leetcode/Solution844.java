package codetest.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {

		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String[] strs1 = s.split("");
		String[] strs2 = t.split("");

		for (String i : strs1) {
			if (i.equals("#")) {
				stack1.pop();
				continue;
			}
			stack1.push(i);
		}
//		if (stack1.isEmpty()) {
//			stack1.push("");
//		}

		for (String i : strs2) {
			if (i.equals("#")) {
				stack2.pop();
				continue;
			}
			stack2.push(i);
		}
//		if (stack2.isEmpty()) {
//			stack2.push("");
//		}

		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			String ch1 = stack1.pop();
			String ch2 = stack2.pop();
			if (!ch1.equals(ch2)) {
				return false;
			}
		}

		return stack1.size() == stack2.size();
	}

	public static void main(String[] args) {

		String str1 = "ab#c";
		String str2 = "ad#c";
		String str3 = "ab##";
		String str4 = "c#d#";
		String str5 = "a#c";
		String str6 = "b";

		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
//		String[] strs1 = s.split("");
//		String[] strs2 = t.split("");

//		for (String i : strs1) {
//			if (i.equals("#")) {
//				stack1.pop();
//				continue;
//			}
//			stack1.push(i);
//		}
////		if (stack1.isEmpty()) {
////			stack1.push("");
////		}
//
//		for (String i : strs2) {
//			if (i.equals("#")) {
//				stack2.pop();
//				continue;
//			}
//			stack2.push(i);
//		}
////		if (stack2.isEmpty()) {
////			stack2.push("");
////		}
//
//		System.out.println(stack1);
//		System.out.println(stack2);
//		System.out.println(stack1.size());
//		System.out.println(stack2.size());
//		while (!stack1.isEmpty() && !stack2.isEmpty()) {
//			String ch1 = stack1.pop();
//			String ch2 = stack2.pop();
//			if (ch1.equals(ch2)) {
//				return false;
//			}
//		}
//
//		return stack1.size() == stack2.size();

	}
}

//public static void main(String[] args) {
//
//	String str1 = "ab#c";
//	String str2 = "ad#c";
//	String str3 = "ab##";
//	String str4 = "c#d#";
//	String str5 = "a#c";
//	String str6 = "b";
//
//	Stack<String> stack1 = new Stack<>();
//	Stack<String> stack2 = new Stack<>();
//	String[] strs1 = str5.split("");
////	System.out.println(Arrays.toString(strs1));
//	String[] strs2 = str6.split("");
////	System.out.println(Arrays.toString(strs2));
//
//	for (String s : strs1) {
//		if (s.equals("#")) {
//			stack1.pop();
//			continue;
//		}
//		stack1.push(s);
//	}
//
//	for (String s : strs2) {
//		if (s.equals("#")) {
//			stack2.pop();
//			continue;
//		}
//		stack2.push(s);
//	}
//	System.out.println(stack1);
//	System.out.println(stack2);
//
////	System.out.println(stack1.pop());
////	System.out.println(stack2.pop());
//
////	return stack1.pop().equals(stack2.pop());
//
//}
//}
//
