package com.anith.stat;

import com.anith.load.Cleansing;
import com.anith.load.LoadParagraph;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordStat {

  public static void main(String[] args) {

    if (args.length <= 1) {
      System.err.println("Input argument missing");
      return;
    }

    LoadParagraph loadParagraph = new LoadParagraph();
    String paragraph = loadParagraph.load(Paths.get(args[1]));

    if (paragraph.isEmpty()) {
      System.err.println("Invalid file supplied");
      System.err.println(args[1] + " not found!");
      return;
    }

    String cleaned = Cleansing.cleanSpecialCharacters(paragraph);
    List<String> bagOfWords = tokenize(cleaned);
    List<String> cleanedWords = Cleansing.cleanSpecialWords(bagOfWords);

    System.out.println("====== Stat summary =======");
    System.out.println("top word     : " + Calculate.topWord(cleanedWords));
    System.out.println("least word   : " + Calculate.leastWord(cleanedWords));
    System.out.println("longest word : " + Calculate.longestWord(cleanedWords));
    System.out.println("shortest word: " + Calculate.shortestWord(cleanedWords));

  }

  private static List<String> tokenize(String paragraph) {
    List<String> bagOfWords = new ArrayList<>();

    return bagOfWords;
  }
}
