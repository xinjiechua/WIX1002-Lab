package L8Q4;
import java.util.Scanner;
public class Fraction {

    private int n,d;

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        n = sc.nextInt();
        System.out.print("Enter denominator: ");
        d = sc.nextInt();
    }

    public void setNumerator(int n){
        this.n = n;
    }

    public void setDenominator(int d){
        this.d = d;
    }

    public int getNumerator(){
        return n;
    }

    public int getDenominator(){
        return d;
    }

    /*
    public int gcd(int a, int b){
        if(a == b)
            return a;
        else if(a > b){  //24>9
            if(a%b==0)
                return b; //return 3
            else
                return gcd(b, a%b);   //gcd(9,6) => gcd(6,3)
        } else {     // 16<28
            if(b%a==0)
                return a;  //return 4
            else
                return gcd(a, b%a); //gcd(16,12) => gcd(16,4)
        }
    } */

    public int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    public void display() {
        int a = gcd(n,d);
        System.out.println("The fraction is: " + getNumerator()/a + "/" + getDenominator()/a);
    }

    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.getInput();
        f.display();
    }

}
