package L7Q1;

import java.io.*;
import java.util.Scanner;
public class L7Q1v2 {
    public static void main(String[] args) {
        String[]code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[]name = {"Programming I","Data Structure","Operating System","Computing Mathematics I"};
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("coursename2.dat"));
            for(int i=0; i<code.length; i++){
                    os.writeUTF(code[i]);
                    os.writeUTF(name[i]);
            }
            os.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }

        boolean status=false;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String input = sc.nextLine();

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("coursename2.dat"));

            while(true){
                if(input.equals(is.readUTF())){
                    System.out.println("Course Code: " + input);
                    System.out.println("Course Name: " + is.readUTF());
                    status = true;
                    break;
                }
                else
                    is.readUTF();
            }
            is.close();
        }catch(IOException ignored){
        }
        if(!status)  //false
            System.out.println("The course " + input + " is not available");
    }
}
