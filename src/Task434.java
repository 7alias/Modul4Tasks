import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task434 {
    public static void task() {

//Напишите регулярку, которая найдет все годы 21 столетия.
        String text = "1999 2000 2001 2002 2003";
        Pattern pattern = Pattern.compile("20..");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }
}
