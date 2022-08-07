//stdin & stdout problem 2
//you need to first read int from stdin & print that
//then you need to read float from stdin & print that
//finally need to read string from stdin & print that

//input
//12
//3.14
//Hello

//output
//12
//3.14
//Hello

import java.util.Scanner;

public class StdInpStdOp2
{
 public static void main(String[] args)
  {
   Scanner scanner = new Scanner(System.in);   //Creating a scanner class of scanner type that inputs values
   
   int integer = scanner.nextInt();   //input values are being inserted
   System.out.println("Int: " + integer);
   
   float decimal = scanner.nextFloat();
   System.out.println("Float: " + decimal);
   
   scanner.nextLine();
   String str = scanner.nextLine();
   
   System.out.println("String: " + str);
  }
}
