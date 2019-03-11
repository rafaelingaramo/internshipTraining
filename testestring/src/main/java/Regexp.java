import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        String idade = "Gabriel Tales Lopes";

        Pattern p = Pattern.compile("(.*) (.*) (.*)");
        final Matcher matcher = p.matcher(idade);

        if (matcher.matches()) {
            System.out.println("SEU NOME EH VALIDO");

            System.out.println(matcher.group(3));
        } else {
            System.out.println("SEU NOME EH INVALIDO");
        }
    }
}
