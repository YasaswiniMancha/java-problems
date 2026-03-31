package problems.level.basicProblems;

public class StringOperations {
	public static void main(String[] args) {
		String s = "Finding String Length";
		String s1 = "another String";
		findLength(s);
		accessEachCharacter(s);
		accessLastCharacter(s);
		modifyString(s, s1);
		System.out.println("string comparison: " + stringComparison(s, s1));
	}

	private static boolean stringComparison(String s, String s1) {
		if (s.equals(s1)) {
			return true;
		}
		return false;
	}

	private static void modifyString(String s, String s1) {
		s.replace("t", "u");
		s.concat("yashu");
		System.out.println("concatenated string: " + (s + s1));
		System.out.println("modified string: " + s);
	}

	private static void accessLastCharacter(String s) {
		System.out.println("Last character: " + s.charAt(s.length() - 1));
	}

	private static void findLength(String s) {
		System.out.println("Length: " + s.length());
	}

	private static void accessEachCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println("each char:" + s.charAt(i));
		}
	}
}
