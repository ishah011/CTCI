// Write a method to decide if two strings are anagrams or not

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static int isAnagram(String one, String two)
  {
    String newone = one.replaceAll("[^A-Za-z]+", "").toLowerCase();
    String newtwo = two.replaceAll("[^A-Za-z]+", "").toLowerCase();
    
    char charone[] = newone.toCharArray();
    char chartwo[] = newtwo.toCharArray();

    Arrays.sort(charone);
    Arrays.sort(chartwo);
    
    String lastone = new String(charone);
    String lasttwo = new String(chartwo);

    if(lastone.equals(lasttwo) == true)
    {
      return 0;
    }
    else
    {
      return -1;
    }
  }
  
  public static void main(String[] args)
  {
    String inone = "anagram";
    String intwo = "gram rana";
    
    isAnagram(inone, intwo);
  }
}
