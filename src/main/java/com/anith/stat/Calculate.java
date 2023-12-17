package com.anith.stat;

import java.util.List;

/**
 * top frequently used word
 * the least used word
 * the longest word
 * the shortest word
 * non english word if any (bonus)
 */
public class Calculate {

  public static String topWord(List<String> bagOfWords) {
    String word = "";
    int maxFrequency = 0;
    for(String temp:bagOfWords) {
      int frequency=0;
      for(String compareword:bagOfWords) {
        if(temp.equals(compareword)) {
          frequency++;
        }
      }
      if(frequency>maxFrequency) {
        word=temp;
        maxFrequency=frequency;
      }
    }
    // TODO: calculate the top word
    return word;
  }

  public static String leastWord(List<String> bagOfWords) {
    String word = "";
    for(String temp:bagOfWords) {
      int frequency=0;
      for(String compareword:bagOfWords) {
        if(temp.equals(compareword)) {
          frequency++;
        }
      }
      if(frequency==1) {
        word=temp;
      }
    }
    // TODO: calculate the least used word
    return word;
  }

  public static String longestWord(List<String> bagOfWords) {
    String word = bagOfWords.get(0);
    for(String temp:bagOfWords) {
      if(temp.length()>word.length()) {
        word=temp;
      }
    }
    // TODO: calculate the longest word
    return word;
  }

  public static String shortestWord(List<String> bagOfWords) {
    String word = bagOfWords.get(0);
    for(String temp:bagOfWords) {
      if(temp.length()<word.length()) {
        if(!(temp.equals('[') && temp.equals(']')) )
        {
          word=temp;
        }
      }
    }
    // TODO: calculate the shortest word
    return word;
  }
}
