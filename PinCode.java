import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PinCode {
    public static void main(String[] args) {
        String postalCode = "A400088";
        Pattern pattern = Pattern.compile("^[![#%&_:;'/|][^a-zA-Z]][4]?[0]{3}[8]{2}");
        Matcher matcher = pattern.matcher(postalCode);
        System.out.println(matcher.find());
    }
}
