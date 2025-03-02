package fMRI_Study_Classes;

public class CountVowels {
    public static void run() {
        String word = "Magdeburg";
        System.out.print(compute(word));
    }

    //SNIPPET_STARTS
    public static int compute(String word) {
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (word.charAt(i) == letters[j]) {
                    result++;
                }
            }
        }

        return result;
    }
}