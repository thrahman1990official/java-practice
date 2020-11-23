package com.company;

public class operatorPrecedence
{
//Create double variable with a value of 20.0
    //Create a 2nd variable of type double with value of 80.0
//Add both numbers together and multiple by 100.00
    //Use remainder operator to figure out what the remainder from result of operation in step 3 and 40.00
// We used remainder operator to figure out what the remainder from result of operation in step 3 and 40.00
    //We used modulus or remainder operator on ints in the course, but we can also it on double
//Create boolean variable that assigns value true if remainder in #4 is 0, or false if its not zero
    //Output boolean variable
//Write an if-then statement that displays message "Got some remainder" if boolean in step 5 is not true.
    //Don't be surprised if you see output for this step
        //where you might expect it not to show
    //I will explain it in my solution
    public static void main(String[] args)
    {
	double myFirVal = 20.00d;
	    double mySecVal = 80.00d;
	double myValTot = myFirVal + mySecVal * 100.00d;
	    System.out.println("MyValuesTotal = " + myValTot);
	double theRemainder = myValTot % 40.00d;
	    System.out.println("theRemainder = " + theRemainder);
	boolean isNoRemainder = (theRemainder == 0) ? true : false;
	    System.out.println("isNoRemainder = " + isNoRemainder);
	if(!isNoRemainder)
	    {
        System.out.println("Got some remainder");
        }
    }
}
