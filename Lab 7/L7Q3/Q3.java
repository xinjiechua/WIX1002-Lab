package L7Q3;

import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try{
            PrintWriter os = new PrintWriter(new FileOutputStream("data.txt"));
            os.println("Kpop Songs I like");
            os.println("Ditto");
            os.println("Through the Night");
            os.println("Reveal");
            os.close();
        } catch(IOException e){
            System.out.println("Problem with file output");
        }

        try{
            PrintWriter os = new PrintWriter(new FileOutputStream("reverse.txt"));
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                for (int i = line.length() - 1; i >= 0; i--)
                    os.print(line.charAt(i));
                os.println();
            }
            os.close();
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
}
