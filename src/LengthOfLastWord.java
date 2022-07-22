import java.util.HashMap;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
//
//            String word = words[words.length - 1];
//
//        return word.length();

        HashMap<Integer, String> wordsList = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            wordsList.put(i, words[i]);
        }

        return wordsList.get(words.length - 1).length();

    }
}
