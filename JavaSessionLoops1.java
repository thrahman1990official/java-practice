//Objective: We are going to be using loops to help us do simple math

//Task
//Give an integer, N, print its first 10 Multiple. Each multiple N x i (where 1 <= i <= 10) should be printed on new line in form: N x i = result

//Input format:
//Single Integer N

//Constraints
//2 <= N <= 20

//Output Format
//Print 10 lines of output: each line i (where 1 <= i <= 10) contains result of N x i in the form: N x i = result

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSessionLoops1
  {
  public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);   //Creating scanner class for taking inputs
    
    System.out.println("Enter a number");
    
    int numberToBeIterated = scanner.nextInt();   //integer numberToBeIterated is declared as an input where numbers are entered
    
    myFunction(numberToBeIterated);   //function call with input numberToBeIterated
    
    scanner.close();  //used for closing usage of input scanner
    } 
  
  static void myFunction(int numInput) //creating a static function called myFunction that takes input numInput that is called from main class input numberToBeIterated
    {
      for(int x=1; x<=10; x++)
        {
        
        }
    }
  }
