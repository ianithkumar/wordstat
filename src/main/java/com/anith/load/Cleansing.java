package com.anith.load;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove unnecessary characters like ,;:+-=(){}$#@!/?<>
 */
public class Cleansing {

  public static String cleanSpecialCharacters(String paragraph) {
    String cleanedParagraph = "";
    // TODO: implement the cleaning logic here

    char[] special = new char[]{',', '!', '#', '$', '%', '&', '*', '(', ')', '-', '+',
        '=', '@', '{', '}', ';', ':', '"', '\\', '?', '.', '<', '>'};
    return cleanedParagraph;
  }

  public static List<String> cleanSpecialWords(List<String> bagOfWords) {
    String special[] = new String[]{"a", "an", "or", "and", "the", "not", "in", "on", "of", "for"};
    List<String> cleanedWords = new ArrayList<>();

    return cleanedWords;
  }
}
