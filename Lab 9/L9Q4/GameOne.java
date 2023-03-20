package L9Q4;

import java.util.Random;

public class GameOne extends Dice {
    private int firstScore, secondScore;

    public GameOne(String n) {
        super(n);
    }

    public void rollDice() {
        Random r = new Random();
        do {
            firstScore = r.nextInt(6) + 1;
            secondScore = r.nextInt(6) + 1;
            this.display();
            addScore(firstScore + secondScore);
            super.display();
            if (getScore() >= 100) {
                displayWin();
                break;
            }
        }while (firstScore == secondScore) ;
    }

    public void display() {
        System.out.println("Dice 1: "+ firstScore + " Dice 2: " + secondScore + " Total: " + (firstScore + secondScore));
    }

    public static void main(String[]args){
        GameOne a = new GameOne("Player1");
        GameOne b = new GameOne("Player2");
        boolean status;
        Random r = new Random();
        if(r.nextInt()%2 == 0)
            status = true;
        else
            status = false;
        while(a.getScore()<100 && b.getScore()<100){
            if(status){
                a.rollDice();
                if(a.getScore() >=100)
                    break;
                b.rollDice();
            }
            else{
                b.rollDice();
                if(b.getScore()>=100)
                    break;
                a.rollDice();
            }
        }
    }
}
