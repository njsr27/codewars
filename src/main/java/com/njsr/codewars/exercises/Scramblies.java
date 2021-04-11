package com.njsr.codewars.exercises;

/**
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * <p>
 * Notes:
 * <p>
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered
 */
public class Scramblies {
  public static boolean scramble(String str1, String str2) {
    char[] str2Letters = str2.toCharArray();
    char[] str1Letters = str1.toCharArray();

    for (char str2Letter : str2Letters) {
      for (int j = 0; j < str1Letters.length; j++) {
        if (str2Letter == str1Letters[j]) {
          str1Letters[j] = '_';
          break;
        }
        if (j == str1Letters.length - 1) {
          return false;
        }
      }
    }

    return true;
  }
}
