package com.anith.load;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LoadParagraph {

  public String load(Path filepath) throws IOException {
    // check if the file exist and is a regular file (readable)
    // load a file and return as a string
    String paragraph = " ";
    // TODO: implementation of file exists or not
    StringBuilder builder = new StringBuilder();
    if (validateFile(filepath) == true) {
      BufferedReader reader = null;
      try {
        reader = new BufferedReader(new FileReader(filepath.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    // TODO: implement load a file, read line by line and return as a string
    return builder.toString();
  }

  protected boolean validateFile(Path filepath) {
    if (Files.exists(filepath) && Files.isRegularFile(filepath)) {
      return true;
    }
    return false;
  }
}
