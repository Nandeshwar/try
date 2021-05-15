import java.util.Stack;

public class Example17BackString2 {
    public static void main(String[] args) {
        System.out.println(new Example17BackString2().isSameString("ab#c", "ad#c"));
        System.out.println(new Example17BackString2().isSameString("abb#c", "adb#c"));
    }

    private Boolean isSameString(String s1, String s2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != '#') {
                stack1.push(s1.charAt(i));
            } else {
                stack1.pop();
            }
        }

        for(int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) != '#') {
                stack2.push(s2.charAt(i));
            } else {
                stack2.pop();
            }
        }

        while(!stack1.empty() && !stack2.empty()) {
            char ch1 = stack1.pop();
            char ch2 = stack2.pop();

            if(ch1 != ch2) {
                return false;
            }
        }

        return true;
    }
}
