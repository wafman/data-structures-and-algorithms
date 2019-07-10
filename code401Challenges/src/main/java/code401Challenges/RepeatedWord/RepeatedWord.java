package code401Challenges.RepeatedWord;


import code401Challenges.hashtable.Hashtable;

import java.util.HashMap;

public class RepeatedWord {

    public static String repeatedWord(String sentence){
        String[] words = sentence.split(" ");
        String temp = "";

        if(words.length < 1){
            throw new NullPointerException("empty string");
        }

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String word : words){
            //regex from stack overflow, see readme for link.
            temp = word.toLowerCase().replaceAll("[^a-zA-Z]+$", "");
            if(hashMap.containsKey(temp)){
                return temp;
            } else {
                hashMap.put(temp, 1);
            }
        }
        return null;
    }
}
