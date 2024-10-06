package com.anith.stat;

import java.util.*;
import java.util.stream.Collectors;

/**
 * top frequently used word
 * the least used word
 * the longest word
 * the shortest word
 */
public class Calculate {
  public String topWord(List<String> bagOfWords) {
    // TODO: Calculate the top word
    String word = "";
    int maxFrequency = 0;
    for (String temp : bagOfWords) {
      int frequency = 0;
      for (String compareword : bagOfWords) {
        if (temp.equals(compareword)) {
          frequency++;
        }
      }
      if (frequency > maxFrequency) {
        word = temp;
        maxFrequency = frequency;
      }
    }
    return word;
  }

  public String leastWord(List<String> bagOfWords) {
    // TODO: Calculate the least used word
    String word = "";
    for (String temp : bagOfWords) {
      int frequency = 0;
      for (String compareword : bagOfWords) {
        if (temp.equals(compareword)) {
          frequency++;
        }
      }
      if (frequency == 1) {
        word = temp;
      }
    }
    return word;
  }

  public String longestWord(List<String> bagOfWords) {
    // TODO: Calculate the longest word
    String word = bagOfWords.get(0);
    for (String temp : bagOfWords) {
      if (temp.length() > word.length()) {
        word = temp;
      }
    }
    return word;
  }

  public String shortestWord(List<String> bagOfWords) {
    // TODO: Calculate the shortest word
    String word = bagOfWords.get(0);
    for (String temp : bagOfWords) {
      if (temp.length() < word.length()) {
        word = temp;
      }
    }
    return word;
  }
}