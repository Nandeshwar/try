public class Example45_CircularString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bcdea";

        Example45_CircularString e = new Example45_CircularString();
        System.out.println(e.circularString(s1, s2));
    }

    boolean circularString(String s1, String s2) {

        for(int i =0, cnt = 0; cnt < s1.length(); cnt++) {
            String newStr = s1.substring(i+1) + s1.substring(0, 1);
            if(newStr.equals(s2)) {
                return true;
            }
            s1 = newStr;
        }
        return false;
    }
}
