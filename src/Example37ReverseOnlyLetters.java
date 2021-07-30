public class Example37ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "abc#de";
        char[] strArr = str.toCharArray();
        int i = 0;
        int j = strArr.length - 1;
        while(i < j) {
            if(!Character.isLetter(strArr[i])) {
                i++;
                continue;
            }

            if(!Character.isLetter(strArr[j])) {
                j--;
                continue;
            }

            char tmp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = tmp;
            i++;
            j--;
        }

        System.out.println("Reversed string");
        System.out.println(String.valueOf(strArr));
    }
}
