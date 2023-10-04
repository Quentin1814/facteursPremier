import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int nombre) {
        List<Integer> facteursPremiers = new ArrayList<>();

        // Cas de base : nombre égal à 1
        if (nombre == 1) {
            return facteursPremiers; // Retourne une liste vide
        }

        // Trouver les facteurs premiers
        for (int diviseur = 2; diviseur <= nombre; diviseur++) {
            while (nombre % diviseur == 0) {
                facteursPremiers.add(diviseur);
                nombre /= diviseur;
            }
        }

        return facteursPremiers;
    }
}
