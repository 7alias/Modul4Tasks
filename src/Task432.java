

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task432 {

    public static void task() {

//Напишите регулярку, которая найдет в строке aba aba a!a abba adca abea строки abba adca abea по шаблону: буква a, 2 любых символа, буква a.
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("a..a");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }

    }
}



