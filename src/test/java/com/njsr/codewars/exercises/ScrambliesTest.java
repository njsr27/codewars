package com.njsr.codewars.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScrambliesTest {

  @Test
  public void scrambleTest1() {
    assertTrue(Scramblies.scramble("rkqodlw", "world"));
  }

  @Test
  public void scrambleTest2() {
    assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
  }

  @Test
  public void scrambleTest3() {
    assertFalse(Scramblies.scramble("katas", "steak"));
  }

  @Test
  public void scrambleTest4() {
    assertFalse(Scramblies.scramble("scriptjavx", "javascript"));
  }

  @Test
  public void scrambleTest5() {
    assertTrue(Scramblies.scramble("scriptingjava", "javascript"));
  }

  @Test
  public void scrambleTest6() {
    assertTrue(Scramblies.scramble("scriptsjava", "javascripts"));
  }

  @Test
  public void scrambleTest7() {
    assertFalse(Scramblies.scramble("javscripts", "javascript"));
  }

  @Test
  public void scrambleTest8() {
    assertTrue(Scramblies.scramble("aabbcamaomsccdd", "commas"));
  }

  @Test
  public void scrambleTest9() {
    assertTrue(Scramblies.scramble("commas", "commas"));
  }

  @Test
  public void scrambleTest10() {
    assertTrue(Scramblies.scramble("sammoc", "commas"));
  }

}
