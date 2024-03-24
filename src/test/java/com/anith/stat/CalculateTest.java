package com.anith.stat;

import com.anith.load.Cleansing;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CalculateTest {
  private Calculate calculate;

  @Before
  public void setup() {
    calculate = new Calculate();
  }

  @Test
  public void topWord() {
    String actual = calculate.topWord(Arrays.asList("India", "USA", "Japan", "France", "India", "France"));
    Assert.assertEquals("India", actual);
  }

  public void leastWord() {
    String actual = calculate.leastWord(Arrays.asList("India", "USA", "Japan", "France", "India", "France"));
    Assert.assertEquals("USA", actual);
  }

  public void longestWord() {
    String actual = calculate.longestWord(Arrays.asList("India", "USA", "Japan", "France", "India", "France"));
    Assert.assertEquals("France", actual);
  }

  public void shortestWord() {
    String actual = calculate.shortestWord(Arrays.asList("India", "USA", "Japan", "France", "India", "France"));
    Assert.assertEquals("USA", actual);
  }

}
