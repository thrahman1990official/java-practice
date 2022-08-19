//Reverse words in an input string of words

//reverse order of words from input string

//input:
//"my name is Jay"
//"hello world"

//ouput:
//"Jay is name my"
//"world hello"

//approach:
//split input string into words
//use stack to reverse order

import java.util.Stack;

public class ReverseWords
  {
  public static void main(String[] args)
    {
    String input = "my name is Jay";
    
    Stack<String> stringStack = new Stack<String>();
    
    String[] words = input.split("\\s+");
    }
  }

