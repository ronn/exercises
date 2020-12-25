package com.ronn.algo;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FirstRepeatedLetter {

  public Character getFirstRepeatedLetter(String word) {
    char[] chars = word.toCharArray();
    int length = chars.length;

    for (int i = 0; i < length; i ++) {
      for (int j = i + 1; j < length; j ++) {
        if (chars[j] == chars[i]) {
          return chars[i];
        }
      }
    }

    return null;
  }

  public Character getFirstRepeatedLetterLinear(String word) {
    char[] chars = word.toCharArray();
    int length = chars.length;

    HashMap<Character, Integer> characters = new HashMap<>();
    characters.put(chars[0], 0);

    for (int i = 1; i < length; i ++) {
      //if ()
    }

    return null;
  }

  @Test
  public void test_repeated_letter() {
    assertNull(getFirstRepeatedLetter("Abcd"));
    assertEquals('B', getFirstRepeatedLetter("ABBcd").charValue());

    long startTime = System.nanoTime();
    assertEquals('l', getFirstRepeatedLetter("globol").charValue());
    long elapsedTime = System.nanoTime() - startTime;

    System.out.println("Total execution time in millis: " + elapsedTime / 10);
  }
}
