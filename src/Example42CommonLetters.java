import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Example42CommonLetters {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>(Arrays.asList("rama", "shyama", "radha"));

        int[] letterMinFrequency = new int[26];
        for (int i=0; i < 26; i++) {
            letterMinFrequency[i] = 5000;
        }

        strList.forEach(str -> {
                       int[] letterFrequency = new int[26];
                       for(int i=0; i < str.length(); i++) {
                           letterFrequency[str.charAt(i) - 97]++;
                       }

                        for (int i=0; i < 26; i++) {
                            letterMinFrequency[i] = Math.min(letterMinFrequency[i], letterFrequency[i]);
                        }
                    }
                );
        StringBuilder s = new StringBuilder();
        for(int i=0; i < 26; i++){
            int lc = letterMinFrequency[i];
            while(lc > 0) {
                s.append((char)(i + 97));
                lc--;
            }
        }

        System.out.println(s);
    }
}
