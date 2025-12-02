package Task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practicum {
    private static final Map<String, String> films = new LinkedHashMap<>();

    static void main(String[] args) {
        films.put("Титаник", "Джеймс Кэмерон");
        films.put("Гарри Поттер и философский камень", "Крис Коламбус");
        films.put("Хакеры", "Иэн Софтли");
        films.put("Терминатор", "Джеймс Кэмерон");

        for (String film : films.keySet()) {
            System.out.println(film);
        }
    }
}