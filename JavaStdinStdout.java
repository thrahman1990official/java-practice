//NOTE: ALWAYS PRINT STATEMENTS IN THE MAIN METHOD

public class JavaStdinStdout
{
  public static void main(String[] args)
  {
    System.out.println("Talha Rahman");
    
    myfunction(); //calls the static function below
  }
  
  static void myfunction()
      {
      System.out.println("Take an input");
    
      Scanner scanner = new Scanner(System.in);   //scanner class input
    
      String name = scanner.next();
    
      int age = scanner.nextInt();
    
      scanner.close();
    
      System.out.println("name is: " + name + "\n" + " age is: " + age);
      }
}
