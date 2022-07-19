import java.util.Base64;

public class MysteriousCode {
    private static String whatIsIt = ""; // result value after decoding the secret
    private static final String secret = "aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K"; // initial value of the secret code
    private static final byte[] sd = Base64.getDecoder().decode(secret); // hint to decode the secret code

    // driver method
    public static void main(String[] args) {
        whatIsIt = new String(sd);
        whatIsIt = reverse(whatIsIt);
        whatIsIt = cleanText(whatIsIt);
        print(whatIsIt);
    }

    /**
     * This method will reverse the String
     * @param s a String to be reversed
     * @return reversed String from
     */
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * this method will clean the String by removing 
     * anything that is not a letter or a number
     * by replace it as a space
     * @param s a String to be cleaned 
     * @return normal String that contain only letters and numbers
     */
    private static String cleanText(String s){
        return s.replaceAll("[^A-Za-z]", " ");
    }

    /**
     * this method will show to the result via console
     * @param s a String to be printed
     */
    private static void print(String s){
        System.out.println(s);
    }
}