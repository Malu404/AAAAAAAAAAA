import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner lineScan = new Scanner(scan.nextLine());

        Map<String, Integer> frequencias = new HashMap<>();

        while (lineScan.hasNext()) {
            String palavra = lineScan.next();
            frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
        }

        frequencias.keySet().stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(palavra -> {
            System.out.printf("%s: %d\n", palavra, frequencias.get(palavra));
        });

        lineScan.close();
        scan.close();
    }
}
