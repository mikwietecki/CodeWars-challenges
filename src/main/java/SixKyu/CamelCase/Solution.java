package SixKyu.CamelCase;
import java.lang.StringBuilder;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"


 */

public class Solution {


    static String toCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split("[-_]");
        StringBuilder result = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            result.append(word.substring(0,1).toUpperCase()).append(word.substring(1));
        }
        return result.toString();
    }
}
