package com.anith.load;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Paths;

public class CleaningTest {
  private Cleansing cleansing;

  @Before
  public void setup() {
    cleansing = new Cleansing();
  }

  @Test
  public void cleanSpecialCharactersTest() {
    String actual = cleansing.cleanSpecialCharacters("How are you?, What a nice day!!!");
    Assert.assertEquals("How are you What a nice day", actual);
  }

  @Test
  public void cleanSpecialCharactersFailedTest() {
    String actual = cleansing.cleanSpecialCharacters("\"Anithkumar\",:Age;21");
    Assert.assertNotEquals("How are you What a nice day", actual);
  }
}
