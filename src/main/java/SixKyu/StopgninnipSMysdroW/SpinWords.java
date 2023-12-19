package SixKyu.StopgninnipSMysdroW;

/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String spinedString = "";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                if (words[i].length() >= 5) {
                    String reveresWord = "";
                    for (int j = words[i].length() - 1 ; j >= 0; j--) {
                        char currentChar = words[i].charAt(j);
                        reveresWord += currentChar;
                    }
                    spinedString += (reveresWord + " ");
                } else {
                    spinedString += (words[i] + " ");
                }
            } else {
                if (words[i].length() >= 5) {
                    String reveresWord = "";
                    for (int j = words[i].length() - 1 ; j >= 0; j--) {
                        char currentChar = words[i].charAt(j);
                        reveresWord += currentChar;
                    }
                    spinedString += reveresWord;
                } else {
                    spinedString += words[i];
                }
            }
        }
        return spinedString;
    }
}
