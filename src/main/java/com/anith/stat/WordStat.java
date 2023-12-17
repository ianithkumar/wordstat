package com.anith.stat;

import com.anith.load.Cleansing;
import com.anith.load.LoadParagraph;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordStat {

  public static void main(String[] args) throws IOException {

    String filepath="C:\\Users\\anith\\OneDrive\\Documents\\wordstatpara.txt";
    List<String> list=new ArrayList<>();
    BufferedReader br=null;
    try{
      br=new BufferedReader(new FileReader(filepath));
      String line;
      while((line= br.readLine())!=null)
      {
        list.add(line);
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally{
      if(br!=null)
      {
        br.close();
      }
    }

    if (list.size() < 1){
      System.out.println("Input argument missing");
      return;
    }
    LoadParagraph loadParagraph = new LoadParagraph();
    String paragraph = loadParagraph.load(Path.of(filepath));
    if (paragraph.isEmpty()) {
      System.err.println("Invalid file supplied");
      System.err.println(args[1] + " not found!");
      return;
    }
    String cleaned = Cleansing.cleanSpecialCharacters(list.toString());
    List<String> bagOfWords = tokenize(cleaned);
    List<String> cleanedWords = Cleansing.cleanSpecialWords(bagOfWords);
    System.out.println("After Cleaning Special Characters And Special Words From The list");
    System.out.println(cleanedWords);
    System.out.println("====== Stat summary =======");
    System.out.println("top word     : " + Calculate.topWord(cleanedWords));
    System.out.println("least word   : " + Calculate.leastWord(cleanedWords));
    System.out.println("longest word : " + Calculate.longestWord(cleanedWords));
    System.out.println("shortest word: " + Calculate.shortestWord(cleanedWords));

  }

  private static List<String> tokenize(String paragraph) {
    List<String> bagOfWords = new ArrayList<>();
    for(String word:paragraph.split(" "))
    {
      bagOfWords.add(word);
    }
    return bagOfWords;
  }
}

