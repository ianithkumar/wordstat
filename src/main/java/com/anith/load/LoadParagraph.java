package com.anith.load;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoadParagraph {

  public String load(Path filepath) throws IOException {
    // check if the file exist and is a regular file (readable)
    // load a file and return as a string
    BufferedReader reader;
    String line = null;
    StringBuilder builder = new StringBuilder();
    try {
      reader = new BufferedReader(new FileReader(filepath.toFile()));
      while ((line = reader.readLine()) != null) {
        builder.append(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    // TODO: implementation of file exists or not

    return builder.toString();
    // TODO: implement load a file, read line by line and return as a string
  }

  protected boolean validateFile(Path filepath) {
    if (Files.exists(filepath) && Files.isRegularFile(filepath)) {
      return true;
    }
    return false;
  }
}
