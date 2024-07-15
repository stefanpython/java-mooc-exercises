
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.translations.put(word, new ArrayList<>()); // Create a new ArrayList for the word
        }
        this.translations.get(word).add(translation); // Add the translation to the list
    }

    public ArrayList<String> translate(String word) {
        if (!this.translations.containsKey(word)) {
            return new ArrayList<>();
        } else {
            return this.translations.get(word);
        }
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
