package com.anith.load;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Remove unnecessary characters like ,;:+-=(){}$#@!/?<>
 */
public class Cleansing {

  public static String cleanSpecialCharacters(String paragraph) {
    String cleanedParagraph = new String();
    // TODO: implement the cleaning logic here
    char[] special = new char[]{',', '!', '#', '$', '%', '&', '*', '(', ')', '-', '+',
        '=', '@', '{', '}', ';', ':', '"', '\\', '?', '.', '<', '>', '[', ']'};
    for(char ch:paragraph.toCharArray()) {
      if(!contain(special,ch)) {
        cleanedParagraph=cleanedParagraph+ch;
      }
    }
    return cleanedParagraph;
  }
  private static boolean contain(char[] array,char target)
  {
    for(char value:array) {
      if(value==target) {
        return true;
      }
    }
    return false;
  }

  public static List<String> cleanSpecialWords(List<String> bagOfWords) {
    String special[] = new String[]{"a", "an", "or", "and", "the", "not", "in", "on", "of", "for", "is", "from", "to", "who", "when", "where"};
    List<String> wordsToRemove= Arrays.asList(special);
    Iterator<String>  iterator =  bagOfWords.iterator();
    while (iterator.hasNext())
    {
      String word=iterator.next();
      if(wordsToRemove.contains(word))
      {
        iterator.remove();
      }
    }
    return bagOfWords;
  }
}
