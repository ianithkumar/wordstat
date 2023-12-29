package com.anith.load;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

/**
 * Remove unnecessary characters like ,;:+-=(){}$#@!/?<>
 */
public class Cleansing {

  public String cleanSpecialCharacters(String paragraph) {
    String cleanedParagraph = new String();
    // TODO: implement the cleaning logic here
    char[] special = new char[]{',', '!', '#', '$', '%', '&', '*', '(', ')', '-', '+',
        '=', '@', '{', '}', ';', ':', '"', '\\', '?', '.', '<', '>', '[', ']', '\''};
    for (char ch : paragraph.toCharArray()) {
      if (!contain(special, ch)) {
        cleanedParagraph = cleanedParagraph + ch;
      }
    }
    return cleanedParagraph;
  }

  private boolean contain(char[] array, char target) {
    for (char value : array) {
      if (value == target) {
        return true;
      }
    }
    return false;
  }

  public List<String> cleanSpecialWords(List<String> bagOfWords) {
    List<String> wordsToRemove = Arrays.asList("a", "an", "or", "and", "the", "not", "in", "on", "of", "for", "is", "from", "to", "who", "when", "where", "its");
    Iterator<String> iterator = bagOfWords.iterator();
    while (iterator.hasNext()) {
      String word = iterator.next().toLowerCase();
      if (wordsToRemove.contains(word)) {
        iterator.remove();
      }
    }
    return bagOfWords;
  }
}
