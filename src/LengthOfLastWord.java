import java.util.HashMap;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");

            String word = words[words.length - 1];

        return word.length();
    }
}
