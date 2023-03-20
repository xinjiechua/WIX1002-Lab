package L9Q4;

import java.util.Random;

public class GameTwo extends Dice {
    private int firstScore;

    public GameTwo(String n) {
        super(n);
    }

    public void rollDice() {
        Random r = new Random();
        int temp, temp1;

        firstScore = r.nextInt(6) + 1;
        this.display();
        if (firstScore == 6) {
            temp = r.nextInt(6) + 1;
            if (temp == 6) {
                this.display();
                this.displayNoScore();
                firstScore = 0;
            } else {
                temp1 = temp;
                temp += firstScore;
                firstScore = temp1;
                this.display();
                firstScore = temp;
            }
        }
        addScore(firstScore);
        if (getScore() == 100) {
            super.display();
            displayWin();
        } else if (getScore() < 100)
            super.display();
        else {
            addScore(-firstScore);
            this.displayNoAdd();
            super.display();
        }
    }

    public void display() {
        System.out.println("Dice : "+ firstScore);
    }

    public void displayNoScore(){
        System.out.println("Roll 6 twice. No Score!");
    }

    public void displayNoAdd(){
        System.out.println("Total score more than 100! No score added.");
    }

    public static void main(String[]args){
        GameTwo a = new GameTwo("Player1");
        GameTwo b = new GameTwo("Player2");
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
