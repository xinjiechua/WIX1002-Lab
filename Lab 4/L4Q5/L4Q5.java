package L4Q5;
/*Write a simple two players dice game. Each player will take turns to roll a dice.
The first players that reach more than 100 points win the game.
If the player rolls a 6, the player will score 6 points and has the chance to roll again.*/

public class L4Q5 {
    public static void main(String[] args) {

        int score1 = 0, score2 = 0;
        for (int i = 0; score1 < 100 && score2 < 100; i++) {
            if(i%2 == 1){
                System.out.println("Player 1's turn");
                score1 = diceRoller();
            } else {
                System.out.println("Player 2's turn");
                score2 = diceRoller();
            }
        }
        System.out.println("Player 1's score: " + score1);
        System.out.println("Player 2's score: " + score2);

        if(score1 > 100)
            System.out.println("Player 1 wins.");
        else
            System.out.println("Player 2 wins.");
    }


    static int diceRoller() {
        int dice, score = 0;
        do{
            dice = (int) (Math.random() * 6 + 1);
            System.out.println("Dice number: " + dice);
            score += dice;
        } while(dice == 6);
    return score;
    }
}