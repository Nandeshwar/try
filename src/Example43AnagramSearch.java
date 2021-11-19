import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example43AnagramSearch {
    public static void main(String[] args) {
        List<String> anagramList = new ArrayList<>(Arrays.asList("ram", "Mar", "Radha", "Dhara", "Mohan"));
    }

    String sortWord(String str) {
        List<String> letterList = Arrays.asList(str.split(""));
        Collections.sort(letterList);
        return String.join("", letterList);
    }
}
