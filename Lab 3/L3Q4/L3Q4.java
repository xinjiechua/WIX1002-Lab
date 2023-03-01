package L3Q4;
//4. Write a simple two players dice game.
// Each player will roll the dice twice and the player with the highest score wins the game.
public class L3Q4 {
    public static void main(String[] args) {

        int dice1, dice2, player1 =0, player2 =0;

        for(int i=0; i<2; i++) {
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);

            player1 += dice1;
            player2 += dice2;
        }

        if(player1 == player2)
            System.out.println("It is a tie.");
        else if(player1 > player2)
            System.out.println("Player 1 wins the game.");
        else
            System.out.println("Player 2 wins the game.");
    }
}
