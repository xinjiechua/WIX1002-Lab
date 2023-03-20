package L9Q4;

/*
Create a Dice game. The first dice game allows the player to roll two dices each time.
If both dice is equal, the player can roll again. The player score each time they roll the
dices. Player that reaches 100 points or more wins the game. The second dice game
allows the player to roll one dice each time. When the dice is 6, the player can roll
one more time. However, if the player rolls 6 again in second attempt, the player
won’t have any score. Player that reaches 100 point wins the game. If the player
scores more than 100, the last score is not counted and the player needs to roll again
in next turn. Create a Tester class to test the program.
 */

public class Dice {
    private String name;
    private int score;

    public Dice(String n){
        name = n;
        score = 0;
    }

    public void addScore(int n){
        score += n;
    }

    public int getScore(){
        return score;
    }

    public void display(){
        System.out.println(name + " scores " + score + " points");
    }

    public void displayWin(){
        System.out.println(name + " wins the game.");
    }
}
