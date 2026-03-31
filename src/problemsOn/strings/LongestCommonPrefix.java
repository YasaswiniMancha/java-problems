package problemsOn.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
 
	public static String longestCommonPrefix(String[] strs) {
		if(strs==null || strs.length==0) return "no common prefix";
		if(strs.length==1) return strs[0];
		for(String s : strs) {
			if(s==null) return "no common prefix";
		}
		Arrays.sort(strs);
		String first= strs[0];
		String last= strs[strs.length-1];
		int i=0;
		while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		
		return (first.substring(0, i).length()!=0)? (first.substring(0, i)): "no common prefix";
				
	}
	
	public static void main(String[] args) {
		String[] str1 = {"float", "fly" , "flop", "flower"};
		String[] str2= {"aws","aww","flaw"};
		String[] str3= {null, null};
		String[] str4= null;
		System.out.println(longestCommonPrefix(str1) );
		System.out.println(longestCommonPrefix(str2) );
		System.out.println(longestCommonPrefix(str3) );
		System.out.println(longestCommonPrefix(str4) );
	}
}
