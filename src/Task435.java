import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class Task435 {

    public static void task() {

        //Задание4.3.5

//                Напишите регулярное выражение,которое находит все английские слова в тексте,начинающиеся и заканчивающиеся на букву s.Например,в тексте:

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching,manipulating and editing a text.It is widely used to define a constraint on strings such as a password.Regular Expressions are provided under java.util.regex package.";

        Pattern pattern = Pattern.compile("\\bs.\\w+s", Pattern.CASE_INSENSITIVE);


        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }


        //            должно быть найдено только слово strings.


    }
}