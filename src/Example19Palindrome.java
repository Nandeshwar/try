public class Example19Palindrome {
    public static void main(String[] args) {

        System.out.println(new Example19Palindrome().isPalindrome("Madam"));
        System.out.println(new Example19Palindrome().isPalindrome("Madam1"));

    }

    private boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();

        String s2 = "";

        for(char c : charArr) {
            if(Character.isDigit(c) || Character.isLetter(c)){
                s2 += c;
            }
        }

        int i = 0;
        int j = s2.length() - 1;

        while(i < j) {
            if(s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
