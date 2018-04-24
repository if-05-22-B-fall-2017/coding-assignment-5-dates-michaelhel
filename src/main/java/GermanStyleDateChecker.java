import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^"
                + "(([0-2]?[0-9])|(3[0-1]))"
                + "[\\s.-]"
                + "((0?[1-9])|(1[0-2]))"
                + "[\\s.-]"
                + "[1-2]?(0|9)?[0-9]{2}"
                + "$");
        Matcher m = p.matcher(dateString);
        return m;
    }
}
