import express from "express";

const app = express();

function replaceSpace(word) {
    word = word.trim();
    return word.replaceAll(" ", "%20");
}

function permutationIsPalindrome(word, permutation) {
    word = word.toLowerCase().split("").sort().join("")
    permutation = permutation.toLowerCase().split("").sort().join("");

    return word === permutation;
}

// function oneAway(word1, word2) {
//     let count = 0;
//     word1 = word1.split("");
//     word2 = word2.split("");
//
//     for(let i = 0; i < word1.length; i++) {
//
//     }


// return true;
// }

// Good morning,
// Today's Byte
//Compare Keystrokes
// This question is asked by Amazon. Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result.
//     Ex: Given the following strings...
// s = "ABC#", t = "CD##AB", return true
// s = "como#pur#ter", t = "computer", return true
// s = "cof#dim#ng", t = "code", return false

function compareKeyStrokes(s, t) {
    let arrS = [];
    let arrT = [];

    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === "#") arrS.pop();
        else arrS.push(s.charAt(i))
    }

    for (let i = 0; i < t.length; i++) {
        if (t.charAt(i) === "#") arrT.pop();
        else arrT.push(t.charAt(i))
    }

    return arrS.join("") === arrT.join("");
}


app.listen(3000, () => {
    // console.log(replaceSpace("Mr John Smith    "));
    // console.log(permutationIsPalindrome("Tact Coa", "taco cat"));
    // console.log(permutationIsPalindrome("Tact Coa", "atco cta"));
    // console.log(permutationIsPalindrome("Tact Coa", "taco cca"));
    // console.log(oneAway("pale", "ple"));
    console.log(compareKeyStrokes("ABC#", "CD##AB"));
    console.log(compareKeyStrokes("como#pur#ter", "computer"));
    console.log(compareKeyStrokes("cof#dim#ng", "code"));


})
