import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

public static void task(){


        String text = "1It is 2interesting TO 4study VERY666, Делайте обучение интересней";
        Pattern pattern = Pattern.compile("[A-Z a-z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {


            System.out.print(matcher.group());

        }
    }
}