import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PinCode {
    public static void main(String[] args) {
        String postalCode = "400 088";
        Pattern pattern = Pattern.compile("[4]?[0]{2}[\\s]*[0]?[8]{2}");
        Matcher matcher = pattern.matcher(postalCode);
        System.out.println(matcher.find());
    }
}
