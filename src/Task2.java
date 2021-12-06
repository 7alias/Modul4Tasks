import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void task() {


        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс]+.*?\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {


            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

}
