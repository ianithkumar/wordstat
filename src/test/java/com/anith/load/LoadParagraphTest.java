package com.anith.load;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadParagraphTest {

  private LoadParagraph loadParagraph;
  private final String FILE_NAME = "/tmp/foo.txt";

  @Before
  public void setup() throws IOException {
    loadParagraph = new LoadParagraph();

    try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
      writer.write("hello world");
    }
  }

  @After
  public void cleanup() throws IOException {
    Files.deleteIfExists(Paths.get(FILE_NAME));
  }

  @Test
  public void validateTest() {
    boolean isValid = loadParagraph.validateFile(Paths.get(FILE_NAME));
    Assert.assertTrue("File Not Exist", isValid);
  }

}
