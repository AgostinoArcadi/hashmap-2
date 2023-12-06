import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> citta = new HashMap<>();
        citta.put("BG", "Bergamo");
        citta.put("PA", "Palermo");
        citta.put("AG", "Agrigento");
        citta.put("AN", "Ancona");

        Collection<String> valoriCitta = citta.values();

        List<String> listCitta = new ArrayList<>(valoriCitta);
        listCitta.sort(Comparator.naturalOrder());

        System.out.println(listCitta);

    }
}
