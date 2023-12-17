package com.anith.load;

import java.nio.file.Files;
import java.nio.file.Path;

public class LoadParagraph {

  public String load(Path filepath) {
    // check if the file exist and is a regular file (readable)
    // load a file and return as a string
    String paragraph = " ";
    // TODO: implementation of file exists or not
    if (validateFile(filepath) != true) {
      return "";
    }

    // TODO: implement load a file, read line by line and return as a string
    return paragraph;

  }

  private boolean validateFile(Path filepath) {
    if (Files.exists(filepath) && Files.isRegularFile(filepath)) {
      return true;
    }
    return false;
  }
}
