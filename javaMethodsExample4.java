package com.company;

public class javaMethodsExample4
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //Create method called displayHighScorePosition
        //It should a players name as a parameter, and 2nd parameter as position in high score table
        //You should display the players name along with a message like "managed to get into position "
        //and position they got and further message " on the high score table ".
        //Create a 2nd method called calculateHighScorePosition
        //It should be send one argument only, the player score
        //it should rent an int
        //1 if score is >1000 and 2 if score is >500 and <1000
        //3 if the score is >100 and <500, 4 in all other cases
        //call both methods and display result of following
        //score of 1500, 900, 400, and 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ali", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Hamzah", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Zubair", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Talhah", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Othman", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Omar", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bilal", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        int position = 4; //assuming position 4 will be returned

        if(playerScore >= 1000)
        {
            position = 1;
        }
        else if(playerScore >= 500)
        {
            position = 2;
        }
        else if(playerScore >= 100)
        {
        position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
