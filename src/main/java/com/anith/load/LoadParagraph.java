package com.anith.load;

import java.nio.file.Path;

public class LoadParagraph {

  public String load(Path filePath) {
    // check if the file exist and is a regular file (readable)
    // load a file and return as a string
    String paragraph = "";
    // TODO: implementation of file exists or not
    if (validateFile(filePath) != true) {
      return "";
    }

    // TODO: implement load a file, read line by line and return as a string

    return paragraph;
  }

  private boolean validateFile(Path filePath) {
    return true;
  }
}
