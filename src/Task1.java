import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {


    /*
    Задача 1

        Сгенерировать строку номеров телефонов в формате «+7 (926) 123-4567» с разделителем «;».
        Найти «платиновые» номера телефонов, оканчивающиеся на 6 нулей.

     */
    public static void task() {

        StringBuilder strBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("^(\\d{3})(\\d{4})$");

        for (int aCount = 1000; aCount <= 9999; aCount++) {
        Matcher matcher = pattern.matcher(Integer.toString(aCount));
            if (matcher.find()) {
                strBuilder.append("+7(926)").append(matcher.group(1)).append("-").append(matcher.group(2)).append(";");
            }
        }
        pattern = Pattern.compile("(\\d[0]{2})-([0]{4})");
        Matcher matcher2 = pattern.matcher(strBuilder);
        while (matcher2.find()) {
            System.out.println("+7(926)" + matcher2.group(1) + "-" + matcher2.group(2) + ";");

        }


    }
}
