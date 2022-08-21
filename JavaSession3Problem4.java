//Given an array of student objects, which contains student name & score
//Write function sort them by their scores
//If scores are same & sort them by their names

//Input
//  Andrew 100
//  Jack 75
//  Justin 75
//  Joe 125
//  Amy 100

//Output
//  Joe 125
//  Amy 100
//  Andrew 100
//  Jack 75
//  Justin 75

//  Approach
//  CompareTo() method
//  if s1 > s2, it returns positive number
//  if s1 < s2, it returns negative number
//  if s1 == s2, it returns zero

public class ComparatorExample
  {
  public static void main(String[] arg)
    {
    Student[] students = new Student[5];
    ModifiedChecker modifiedChecker = new ModifiedChecker();
    
    students[0] = new Student("Andrew", 100);
    students[1] = new Student("Jack", 75);
    students[2] = new Student("Justin", 75);
    students[3] = new Student("Joe", 125);
    students[4] = new Student("Amy", 100);
    
    Array.sort(students, modifiedChecker);
    }
  }


