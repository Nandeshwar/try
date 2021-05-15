// https://www.youtube.com/watch?v=tUxW1JwEb9M
public class Example16BackString {
    public static void main(String[] args) {
        Example16BackString e = new Example16BackString();
        System.out.println(e.isStringSame("ab#c", "ad#c"));
        System.out.println(e.isStringSame("abc#c", "adc#c"));
    }

    Boolean isStringSame(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            int cnt = 0;

            while (i >= 0 && (cnt > 0 || s.charAt(i) == '#')) {
                if (s.charAt(i) == '#') {
                    cnt++;
                } else {
                    cnt--;
                }
                i--;
            }

            while (j >= 0 && (cnt > 0 || t.charAt(j) == '#')) {
                if (t.charAt(j) == '#') {
                    cnt++;
                } else {
                    cnt--;
                }
                j--;
            }

            if(i >=0 && j >= 0) {
                if(s.charAt(i) != t.charAt(j)) {
                    return false;
                } else {
                    i--;
                    j--;
                }
            } else {
                if(i >=0 || j >= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
