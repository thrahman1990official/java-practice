//We use integers a, b, & n, to create following series:

//(a + (2^0) * b), (a + ((2^0) * b) + ((2^1) * b)),...,(a + ((2^0) * b) + ((2^1) * b))

//You are given 'q' queries in form of a, b, & n. For each query, print series corresponding to given a, b, & n values, as a single line of 'n' space
//separated integers.

//INPUT FORMAT
//first line contains an integer 'q' denoting number of queries
//Each line 'i' of 'q' subsequent lines contains three space-separated integers
//describing respective a(i), b(i), & n(i) values for that query

//CONSTRAINTS
//0<=q<=500
//0<=q<=50
//1<=n<=15

//OUTPUT FORMAT
//For each query, print corresponding series on new line. Each series must be printed in order as single line of 'n' space-separated integers

import java.util.Scanner;

public class JavaSessionLoops2
  {
  public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Number of times series need to be implemented: ");
      int n = scanner.nextInt(); 
    
    System.out.println("Initial Value: ");
      int a = scanner.nextInt();
    
    System.out.println("Constant value that needs to be multiplied with every element: ");
      int b = scanner.nextInt();
    
    myFunction(n, a, b);
    
    scanner.close();
    }
  
  static void myFunction(int n, int a, int b)
    {
      for (int x=0; x<n; x++)
      {
        
      }
    }
  }
