import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String texto = "abc";

        if (texto.matches("\\w+")) {
            System.out.println("funcionou");
        }
    }
}
