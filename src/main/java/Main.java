import org.springframework.expression.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        String jt = "Java engineer";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        jt = "C# engineer";
        normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        jt = "Chief Accountant";
        normalisedTitle = n.normalise(jt);
        //output normalisedTitle
    }
}
