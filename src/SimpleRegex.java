import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
        String text = "34-120";

        System.out.println(Pattern.matches("[0-9]{2}-[0-9]{3}", text));

        //(+48) 123-123-123

        System.out.println(Pattern.matches("\\(\\+?[0-9]{1,3}\\) ?([0-9]{3}-?){2}[0-9]{3}","(+48) 123-123-123"));
        System.out.println(Pattern.matches("[A-ZŁŹŻ][a-z]{2,} [A-Z][a-z]+","Oskar Polak"));
        System.out.println(Pattern.matches("[\\w#&^%*!]{1,30}@[\\w\\-]{1,25}\\.[a-z]{2,10}", "cos@cos.pl"));

    }
}
