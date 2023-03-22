package Lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        Pattern myPattern = Pattern.compile("stepIT", Pattern.CASE_INSENSITIVE); // the pattern we are looking for and optional flags
        Matcher myMatcher = myPattern.matcher("Visit StepIT!"); // the string we are looking into

        if (myMatcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }


        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,6}", "aru")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "gjk132")); //false
        System.out.println(Pattern.matches("[78]{2}\\d{9}", "78gjk#132try")); //false
        System.out.println(Pattern.matches("[78]{2}[0-9]{9}", "78gjk#132try")); //false
        System.out.println(Pattern.matches("[78]{2}\\d{9}", "78456378900")); //true


        final String EXAMPLE_TEXT = "This is an example of a text, please check if it got corrected . here !";
        String pattern = "(\\w)(\\s+)([\\.,\\?\\!])";
        System.out.println(EXAMPLE_TEXT.replaceAll(pattern, "$1$3"));

        String EXAMPLE_TEXT_1 = "This is an example of a text, please check if it got corrected . here !";

    }

}
