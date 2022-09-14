//Input format
//Every line of input will contain string followed by an Integer
//Each string will have a maximum of 10 Alphatics characters, and each integer will be in inclusive range from 0 to 999

//Output format
//In each line of output there should be two columns:
//The first column contains String & is left justified using exactly 15 characters
//The second column contacts Integer, expressed in exactly in 3 digits, if original input has less than three digits, you must pad your output's
//leading digits with zeroes

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSessionOutputFormatting      //class name should always be same as file name
{
  public static void main(String [] args)
    {
    //script starts
    Scanner scanner = new Scanner(System.in);     //Scanner class input
    
    System.out.println("Enter string: "); 
        String s1 = scanner.next();                 //We will create a String type variable input called s1 and insert values using scanner class
    if(s1.length()>10)                              //if condition stating that if string length of number of characters entered is greater than ten
      {
      System.out.println("Enter string less than 10");
      s1 = scanner.next();                              //re-enter the string characters to the appropriate string value
      }
    
    System.out.println("Enter integer: ");
        int i1 = scanner.nextInt();                    //we will create an integer type variable input called i1 and insert values using scanner class
            
    if (i1<0 || i1>999)                               //if the integer value is not within the range of 0 to 999
      {
      System.out.println("Enter integer within the specified range");       
        i1 = scanner.nextInt();                                             //you will need to re-enter the integer value once again
      }
    
    if (String.valueOf(i1).length()==2)       //we are converting integer i1 into a string value of i2 
        {
        i2="0"+i1;                             //if its value is of two digits, we add zero in front of it
        }
    else if (String.valueOf(i1).length()==2)
        {
        i2="00"+i1;
        }
    //script ends
    }
}
