package regex_regularExpressions.patternClass;
import java.util.regex.*;

public class PatternMethodsExample {
	
    public static void main(String[] args) {
        
        // 1. compile(String regex): It is used to compile the given regular expression into a pattern.
        Pattern p1 = Pattern.compile("\\d+"); // matches digits
        Matcher m1 = p1.matcher("123abc");
        System.out.println("compile(String regex): " + m1.find()); // true

        // 2. compile(String regex, int flags): It is used to compile the given regular expression into a pattern with the given flags.
        Pattern p2 = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher m2 = p2.matcher("I love Java");
        System.out.println("compile(String regex, int flags): " + m2.find()); // true

        // 3. flags(): It is used to return this pattern's match flags.
        int patternFlags = p2.flags();
        System.out.println("flags(): " + patternFlags); // 2 (CASE_INSENSITIVE)

        // 4. matcher(CharSequence input) :It is used to create a matcher that will match the given input against this pattern.
        Matcher m3 = p1.matcher("abc123xyz");
        System.out.println("matcher(CharSequence input): " + m3.find()); // true

        // 5. matches(String regex, CharSequence input): It is used to compile the given regular expression and attempts to match the given input against it.
        boolean result5 = Pattern.matches("\\d+", "12345"); // whole string match
        System.out.println("matches(String regex, CharSequence input): " + result5); // true

        // 6. pattern(): It is used to return the regular expression from which this pattern was compiled.
        System.out.println("pattern(): " + p1.pattern()); // \d+

        // 7. quote(String s): It is used to return a literal pattern String for the specified String.
        String quoted = Pattern.quote("a+b");
        System.out.println("quote(String s): " + quoted); // \Qa+b\E
        System.out.println("quote usage match: " + Pattern.matches(quoted, "a+b")); // true

        // 8. split(CharSequence input): It is used to split the given input sequence around matches of this pattern.
        Pattern p3 = Pattern.compile("\\s+"); // split by whitespace
        String[] words1 = p3.split("Java Regex Split Example");
        System.out.print("split(CharSequence input): ");
        for (String w : words1) System.out.print(w + " ");
        System.out.println();

        // 9. split(CharSequence input, int limit):It is used to split the given input sequence around matches of this pattern. The limit parameter controls the number of times the pattern is applied.
        String[] words2 = p3.split("Java Regex Split Example", 2);
        System.out.print("split(CharSequence input, int limit): ");
        for (String w : words2) System.out.print(w + " ");
        System.out.println();

        // 10. toString(): It is used to return the string representation of this pattern.
        System.out.println("toString(): " + p3.toString()); // \s+
    }
}
