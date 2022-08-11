//ANAGRAM CHECK
//GIVEN TWO STRINGS, CHECK WHETHER THEY ARE ANAGRAMS.
//TWO STRINGS ARE CALLED ANAGRAMS IF BOTH OF THEM CONTAIN SAME CHARACTERS WITH SAME FREQUENCIES.

//EXAMPLE:ANAGRAMS FOR "CAR" ARE ARC, ACR, CRA, RAC, RCA

//NOTE: IGNORE CASE-SENSITIVENESS FOR THIS PROBLEM

//INPUT
//->RACE
//->CARE

//OUTPUT
//->TRUE

//APPROACH TAKEN:
//1ST -> CONVERT INPUT STRING TO LOWERCASE
//2ND -> CONVERT STRINGS TO CHARARRAYS
//3RD -> SORT CHARARRAYS & CHECK FOR EQUALITY

import java.util.Arrays;
import java.util.locale;

public class AnagramCheck
{
  public static void main(String[] args)
    {
    String str1 = "Race";
    String str2 = "Care";
    
    boolean result = areAnagrams(str1, str2);
    
    if(result)
      System.out.println("Input strings are anagrams.");
    else
      System.out.println("Input strings are NOT anagram.");
    }
  private static boolean areAnagrams(String str1, String str2)
    {
    boolean result = false;
    
    if(str1.length() == str2.length())
      {
      String s1 = str1.toLowerCase();
      String s2 = str2.toLowerCase();
      
      char[] chars1 = s1.toCharArray();
      char[] chars2 = s2.toCharArray();
      }
    }
}



