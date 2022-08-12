import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    public String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] strParts = text.split("\\P{IsAlphabetic}+");
        Set<String> setOfText = new HashSet<>(Arrays.asList(strParts));
        return setOfText.contains(word);
    }
}
