//In this problem, you need to first read integers x, y, & n, from stdin.
//Using these numbers, print following series:
//(x + ((3^0)*y)), (x + ((3^0)*y) + ((3^1)*y)) ... (x + ((3^0)*y) + ((3^1)*y) + (3^(n-1)*y)
//input
//0
//2
//3
//output
//2
//8
//26

import java.util.Map;
import java.util.Scanner;

public class SampleSeries
{
  public static void main(String[] args)
  {
   Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = scanner.nextInt();
    
    int output = a;
    
    for(int i = 0; i < n; i++)
      {
      output += (b * Math.pow(3, i));
      System.out.println(output);
      }
  }
}
