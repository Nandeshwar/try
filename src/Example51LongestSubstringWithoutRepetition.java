import java.util.HashSet;
import java.util.Set;

public class Example51LongestSubstringWithoutRepetition {
    public static void main(String[] args) {
        Example51LongestSubstringWithoutRepetition e = new Example51LongestSubstringWithoutRepetition();
        String str = "pwwwkew";
        System.out.println(e.maxLenOfSubstringWithoutRepetion(str));
        int expectedLen = 3;


    }

    private int maxLenOfSubstringWithoutRepetion(String str) {
        int max = 0;
        char[] strArr = str.toCharArray();
        Set<Character> s = new HashSet<>();
        for(int i=0; i < strArr.length; i++) {
            if(!s.contains(strArr[i])) {
                s.add(strArr[i]);
                max = Math.max(max, s.size());
            } else {
                s = new HashSet<>();
                s.add(strArr[i]);
            }
        }

        return max;
    }
}
