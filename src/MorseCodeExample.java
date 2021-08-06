public class MorseCodeExample {
    public static void main(String[] args) {
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String str = "nan";

        for(int i = 0; i < str.length(); i++ ) {
            System.out.println(morseCode[str.charAt(i)-97]);
        }
    }
}
