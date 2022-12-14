package crackingthecodinginterview;

import java.util.HashMap;

public class ArraysAndStrings {
    public String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String w : words) {
            sentence.append(w);
        }

        return sentence.toString();
    }

    //1.1
    public Boolean isUnique (String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                return false;
            }
            map.put(str.charAt(i), 1);
        }
        return true;
    }

    //1.2

    public String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public Boolean permutation (String s, String t) {
        if(s.length() != t.length()) return false;

        return sort(s).equals(sort(t));
    }

    //1.3
    public String replaceSpaces (String s) {

        return s.replace(" ", "%20");

    }

    //1.4
//    public Boolean palindromePermutation(String s) {
//
//    }

}
