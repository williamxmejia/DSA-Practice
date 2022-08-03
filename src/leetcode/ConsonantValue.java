package leetcode;

import java.util.HashMap;

public class ConsonantValue {
    public static int solve(final String s) {

        int sum = 0;
        int sum1 = 0;
        String letter="";

        HashMap<Character, Integer> alphabet = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < letters.length; i++) {
            alphabet.put(letters[i], i + 1);
        }

        System.out.println(alphabet);

        for (int i = 0; i < s.length(); i++) {
//            char letter = s.charAt(i);
            letter = String.valueOf(s.charAt(i));
//            System.out.println(letter);

//            System.out.println(alphabet.get(letter));
            if (letter != "a" || letter != "e" || letter != "i" || letter != "o" || letter != "u") {
                sum += alphabet.get(letter.charAt(0));
                if(sum1 < sum) sum1 = sum;
            } else sum = 0;

        }

        System.out.println(sum);
        return sum1;
    }
}