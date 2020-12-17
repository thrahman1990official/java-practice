package com.company;

public class ifAndElseExample
{
    public static void main(String[] args)
    {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    if(score < 5000 && score > 1000)
        System.out.println("Your score was less than 5000 but greater than 1000");
    else if(score < 1000)
        System.out.println("Your score less than 1000");
    else
        System.out.println("Got here");

        if(gameOver == true)
        {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
        }

        //Challenge: Print out a second score on the screen with the following
        //score set to 1000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver)
        {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
