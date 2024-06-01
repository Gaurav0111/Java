import java.util.regex.*;

public class Example {
    public static void main(String[] args) {
        // Create a regular expression pattern
        Pattern pattern = Pattern.compile("[a-z<>?]+", Pattern.CASE_INSENSITIVE);
        // System.out.println(pattern);
        // Create a string to match against the pattern
        String string = "< [ This ? is ] a st [ring > .";

        // Create a Matcher object
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher);
        // Find all matches for the pattern in the string
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}