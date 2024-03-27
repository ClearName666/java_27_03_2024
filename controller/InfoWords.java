package controller;

import java.util.HashMap;

public class InfoWords {

    private InfoWords() {}

    public static int cntWords(String[] words) {
        return words.length;
    }
    public static String findHighWord(String[] words) {

        if (words.length == 0) return "";

        int indexWord = 0;
        int lenWord = 0;
        for (int i = 0; i < words.length; i++) {
            int lenWordNext = words[i].length();
            if (lenWord < lenWordNext) {
                indexWord = i;
                lenWord = lenWordNext;
            }
        }
        return words[indexWord];
    }

    public static HashMap<String, Integer> frequencyOfWords(String[] words) {
        HashMap<String, Integer> frequency = new HashMap<>();
        for(String word : words) {
            Integer cntFreq = frequency.get(word);
            if (cntFreq != null) {
                frequency.put(word, cntFreq+1);
            } else {
                frequency.put(word, 1);
            }
        }
        return frequency;
    }
}
