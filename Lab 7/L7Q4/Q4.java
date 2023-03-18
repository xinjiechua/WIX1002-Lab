package L7Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            int line=0, character = 0,word=0;
            while(sc.hasNextLine()){
                String lines = sc.nextLine();
                line++;
                character += lines.length();
                word += lines.split(" ").length;
            }
            System.out.println("Number of characters: " + character);
            System.out.println("Number of words: " + word);
            System.out.println("Number of lines: " + line);
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }

    }
}
