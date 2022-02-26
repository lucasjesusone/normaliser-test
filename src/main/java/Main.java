import org.springframework.expression.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {


        Normaliser n = new Normaliser();

        String c = "C# engineer";
        String normalisedTitle = n.normalise(c);
        Double qualityScore = n.compareStrings(normalisedTitle, c);
        System.out.printf("\nInput: %s\nOutput: %s\nSimilarity: %.2f\n", c, normalisedTitle, qualityScore);

        String jt = "Java engineer";
        String normalisedJavaEngineerTitle = n.normalise(jt);
        double qualityJavaEngineerScore = n.compareStrings(normalisedJavaEngineerTitle, jt);
        System.out.printf("\nInput: %s\nOutput: %s\nSimilarity: %.2f\n", jt, normalisedJavaEngineerTitle, qualityJavaEngineerScore);



        String a = "Accountant";
        String normalisedAccountantTitle = n.normalise(a);
        double qualityAccountantScore = n.compareStrings(normalisedAccountantTitle, a);
        System.out.printf("\nInput: %s\nOutput: %s\nSimilarity: %.2f\n", a, normalisedAccountantTitle, qualityAccountantScore);


        String ca = "Chief Accountant";
        String normalisedChiefAccountantTitle = n.normalise(ca);
        double qualityChiefAccountantScore = n.compareStrings(normalisedChiefAccountantTitle, ca);
        System.out.printf("\nInput: %s\nOutput: %s\nSimilarity: %.2f\n", ca, normalisedChiefAccountantTitle, qualityChiefAccountantScore);
    }
}
