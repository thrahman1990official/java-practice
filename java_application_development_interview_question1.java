import java.util.*

public class java_application_development_interview_question1
{
// You can run the code starting from public ... class abc
  public final class abc
  {
   class Inner
    {
    void sample()
      {
      if(abc.this.flag)
        {
        testing();
        }
      } 
    }
    private boolean flag = true;
    
    public void testing()
      {
      System.out.println("Testing");
      }
    public abc()
      {
      (new Inner()).sample();
      }
  }
  //Examine following code, it includes inner class, what will be output of the following code
  public class Main
    {
    public static void main(String [] args)
      {
      new abc();  //here we have created abc object meaning abc constructor is going to be called
      }
    }
//till the above bracket if you are testing on an online compiler
}

//Concepts to know: Constructor, Final Class
//Constructor is special function called only at the time of objectation & name is same as class name
//Final class is a type of class that no one can get inheritence from
