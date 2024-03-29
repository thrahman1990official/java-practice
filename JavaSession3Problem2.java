//Given input string, remove all duplicate words from string.

//for given input:
//Hello world hello world world

//the resulting output should be:
//Hello world

//Approach taken: Split input string into words
//Use LinkedHashSet to remove duplicates

import.java.util.Locale;

public class RemoveDuplicates
  {
  public static void main(String[] args)
    {
    String input = "Hello world hello world world";
    
  input = input.toLowerCase(locale.ROOT);
    
    LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
    
    String[] words = input.split("\\s+");
    
    for (String word: words)
        stringLinkedHashSet.add(word);
    
    String output = "";
    
    for(String word: stringLinkedHashSet)
      {
      output = output + word + "";
      }
    System.out.println("Output: " + output);
    }
  }
