package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static String sortString(String inputString) {
		char[] ar = inputString.toLowerCase().toCharArray();
		Arrays.sort(ar);
		String sorted = String.valueOf(ar);
		return sorted;
	}

	private static ArrayList<String> checkAnagram(String[] a) {

		ArrayList<String> output = null;
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(sortString(a[i]))) {
				continue;
			} else {
				map.put(sortString(a[i]), a[i].toLowerCase());
			}
		}
		output = new ArrayList<>(map.values());
		return output;
	}

	public static void main(String[] args) {

		String input[] = { "anagramm", "marganaa", "anagramm", "marganaa","Hello","hello","CAT","ACT","TAC" };
		ArrayList<String> output = checkAnagram(input);
		Collections.sort(output);
		System.out.println(output);

	}

}
