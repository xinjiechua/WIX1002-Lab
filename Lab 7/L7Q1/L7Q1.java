package L7Q1;

import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        String[] code = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
        String[] name = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            for (int i = 0; i < code.length; i++) {
                outputStream.writeUTF(code[i]);
                outputStream.writeUTF(name[i]);
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        boolean status = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter course code:");
        String input = sc.nextLine();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            try {
                while (true) {
                    if (input.equals(inputStream.readUTF())) {
                        System.out.println("Course Code: " + input);
                        System.out.println("Course Name: " + inputStream.readUTF());
                        status = true;
                        break;
                    } else
                        inputStream.readUTF();
                }
            } catch (EOFException e) {
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
        if (!status)
            System.out.println("The course " + input + " is not available");
    }
}

