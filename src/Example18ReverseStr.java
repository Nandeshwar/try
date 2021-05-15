import java.nio.charset.StandardCharsets;

public class Example18ReverseStr {

    public static void main(String[] args) {

        String str = "Nandeshwar";

        int i = 0;
        int j = str.length() - 1;

        char[] str2 = str.toCharArray();

        while(i < j) {
            char tmp = str2[i];
            str2[i] = str2[j];
            str2[j] = tmp;
            i++;
            j--;

        }
        System.out.println(str2);
    }
}
