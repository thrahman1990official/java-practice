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

public class ReverseWord2
  {
  public static void main(String[] args)
    {
    String input = "my name is Talha";
    
    String[] words = input.split("\\s +");
    
    String output = "";
    
    for (int i = words.length - 1; i >= 0; i--)
      {
      output += words[i] + " ";
      }
    System.out.println("Output: " + output);
    }
  }
