import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example39UniqueEmails {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<String>(Arrays.asList("nks.sah@yahoo.com","nks.sah+abc@yahoo.com", "nanshu@gmail.com"));
        Example39UniqueEmails e = new Example39UniqueEmails();
        List<String> newEmails = emails.stream().map(x -> e.fixEmail(x)).distinct().collect(Collectors.toList());

        newEmails.forEach(x -> System.out.println(x));


    }

    static String fixEmail(String email) {
        String[] emailParts = email.split("@");
        String part1 = emailParts[0];
        String part2 = emailParts[1];

        part1 = part1.replaceAll("\\.", "");
        int plusIndex = part1.indexOf("+");
        if(plusIndex >= 0) {
            part1 = part1.substring(0, plusIndex);
        }
        String newEmail =  part1 + "@" + part2;
        return newEmail;
    }
}
