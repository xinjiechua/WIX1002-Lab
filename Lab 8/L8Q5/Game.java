package L8Q5;

/* Define a class Game. The class has a constructor that accept player name. Besides, the class
contains a method move that roll the dice. Create a Tester class to test the program with two
players and the player that reach 100 or more win the game.
 */

import java.util.Random;

public class Game {
    private String name;
    private int dice, amount;
    private Random r;

    public Game(String n){
        name = n;
        amount = 0;
        r = new Random();
    }

    public int getAmount(){
        return amount;
    }

    private String getName(){
        return name;
    }

    public void move(){
        dice = r.nextInt(6)+1;
        amount += dice;
        System.out.println(name + " rolls " + dice + " Total: " + amount);
    }

    public static void main(String[]args){
        Game player1 = new Game("Sam");
        Game player2 = new Game("John");

        while(true) {
            player1.move();
            if (player1.getAmount() >= 100) {
                System.out.println(player1.getName() + "WIN!");
                break;
            }
            player2.move();
            if (player2.getAmount() >= 100) {
                System.out.println(player1.getName() + "WIN!");
                break;
            }
        }
    }
}
