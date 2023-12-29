package com.anith.stat;

import com.anith.load.Cleansing;
import com.anith.load.LoadParagraph;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WordStat {

  public static void main(String[] args) throws IOException {

    String filepath = "C:\\Users\\anith\\OneDrive\\Documents\\wordstatpara.txt";

    if (filepath.length() < 1) {
      System.out.println("Input argument missing");
      return;
    }
    LoadParagraph loadParagraph = new LoadParagraph();
    String paragraph = loadParagraph.load(Path.of(filepath));
    System.out.println("The list which was read from the system");
    System.out.println(paragraph);
    if (paragraph.isEmpty()) {
      System.err.println("Invalid file supplied");
      System.err.println(args[1] + " not found!");
      return;
    }
    Cleansing cleansing = new Cleansing();
    String cleaned = cleansing.cleanSpecialCharacters(paragraph);
    List<String> bagOfWords = tokenize(cleaned);
    List<String> cleanedWords = cleansing.cleanSpecialWords(bagOfWords);
    Calculate calculate = new Calculate();
    System.out.println("====== Stat summary =======");
    System.out.println("top word     : " + calculate.topWord(cleanedWords));
    System.out.println("least word   : " + calculate.leastWord(cleanedWords));
    System.out.println("longest word : " + calculate.longestWord(cleanedWords));
    System.out.println("shortest word: " + calculate.shortestWord(cleanedWords));

  }

  private static List<String> tokenize(String paragraph) {
    List<String> bagOfWords = new ArrayList<>();
    for (String word : paragraph.split(" ")) {
      bagOfWords.add(word);
    }
    return bagOfWords;
  }
}

