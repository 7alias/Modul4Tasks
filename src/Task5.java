import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static void task() {
        String text = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";


    Pattern pattern = Pattern.compile("[A-z]+Error");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){

            System.out.println(matcher.group());

        }
}
}
