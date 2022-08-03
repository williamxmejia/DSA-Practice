package leetcode;

import java.util.HashMap;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int goodSum = 0;
        int evilSum = 0;

        String[] goodGuys = {
                "Hobbits",
                "Men",
                "Elves",
                "Dwarves",
                "Eagles",
                "Wizards"
        };

        String[] evilGuys = {
                "Orcs",
                "Men",
                "Wargs",
                "Goblins",
                "Uruk Hai",
                "Trolls",
                "Wizards"
        };

        String[] goodArray = goodAmounts.split("\\s");
        String[] evilArray = evilAmounts.split("\\s");
        HashMap<String, Integer> good = new HashMap<>();
        HashMap<String, Integer> evil = new HashMap<>();

        for (int i = 0; i < 6; i++) {

            if (goodGuys[i] == "Hobbits") {
                good.put(goodGuys[i], Integer.valueOf(goodArray[i]));
            }

            if (goodGuys[i] == "Men") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 2));
            }

            if (goodGuys[i] == "Elves" || goodGuys[i] == "Dwarves") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 3));
            }

            if (goodGuys[i] == "Eagles") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 4));
            }

            if (goodGuys[i] == "Wizards") {
                good.put(goodGuys[i], (Integer.valueOf(goodArray[i]) * 10));
            }

            goodSum += good.get(goodGuys[i]);

        }

        System.out.println(goodSum);


        for (int i = 0; i < 7; i++) {

            if (evilGuys[i] == "Orcs") {
                evil.put(evilGuys[i], Integer.valueOf(evilArray[i]));
            }

            if (evilGuys[i] == "Men" || evilGuys[i] == "Wargs" || evilGuys[i] == "Goblins") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 2));
            }

            if (evilGuys[i] == "Uruk Hai") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 3));
            }

            if (evilGuys[i] == "Trolls") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 5));
            }

            if (evilGuys[i] == "Wizards") {
                evil.put(evilGuys[i], (Integer.valueOf(evilArray[i]) * 10));
            }

            evilSum += evil.get(evilGuys[i]);
        }

        System.out.println(evilSum);



        if (goodSum > evilSum) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilSum > goodSum) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}