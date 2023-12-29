package com.anith.load;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Paths;

public class LoadParagraphTest {

  private LoadParagraph loadParagraph;

  @Before
  public void setup() {
     loadParagraph = new LoadParagraph();
  }

  @Test
  public void validateTest() {
    boolean isValid = loadParagraph.validateFile(Paths.get("C:\\Users\\anith\\OneDrive\\Documents\\wordstatpara.txt"));
    Assert.assertTrue("File Not Exist",isValid);
  }

}
