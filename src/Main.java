import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    //Expresiones regulares
    //\bHola mundo\b
    //\b[hH][oO][lL][aA] [mM][uU][nN][dD][oO]\b
    //\b(Java|Python|Go|Pascal|Perl)\b
    //^[a-zA-Z0-9._%+-]+@(unison\.mx|uson\.mx)$
    //^ISI\d{4}-[12]\.(txt|csv)$

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ingresa un argumento");
            return;
        }

        String input = args[0];

        String regex = "\\b[hH][oO][lL][aA] [mM][uU][nN][dD][oO]\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("La cadena si es valida");
        } else {
            System.out.println("La cadena no es válida");
        }
    }
}
