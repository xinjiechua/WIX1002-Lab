package L9Q2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Student extends PersonProfile{
    private String[]courseCode, courseName;
    private int[]semester, session;
    private double[]mark;
    private String fileName;

    public Student(String name,String gender, String dob, String n){
        super(name,gender,dob);
        fileName = n;
        getInput();
    }

    public void getInput(){
        int i, cnt=0;

        try {
            Scanner input = new Scanner(new FileInputStream(fileName));
            while (input.hasNextLine()) {
                for(i = 0; i<5;i++){
                    input.nextLine();
                }
                cnt++;
            }
            input.close();
            courseCode = new String[cnt];
            courseName = new String[cnt];
            semester = new int[cnt];
            session = new int[cnt];
            mark = new double[cnt];

            input = new Scanner(new FileInputStream(fileName));
            i = 0;
            while (input.hasNextLine()) {
                courseCode[i] = input.nextLine();
                courseName[i] = input.nextLine();
                semester[i] = Integer.parseInt(input.nextLine());
                session[i] = Integer.parseInt(input.nextLine());
                mark[i] = Double.parseDouble(input.nextLine());
                i++;
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File was no found");
        }
    }
    public String getGrade(double mark){
        if(mark >= 85)
            return"A";
        else if(mark >= 75)
            return"A-";
        else if(mark >= 70)
            return"B+";
        else if(mark >= 65)
            return"B";
        else if(mark >= 60)
            return"B-";
        else if(mark >= 55)
            return"C+";
        else if(mark >= 50)
            return"C";
        else if(mark >= 45)
            return"D";
        else if(mark >= 35)
            return"E";
        else
            return"F";
    }

    public void display(){
        super.display();
        System.out.println("A list of courses taken");
        for(int i=0; i<courseCode.length; i++){
            System.out.print(courseCode[i] + " " + courseName[i] + " " + session[i] + " " + semester[i] + " ");
            System.out.println(mark[i] + " " + getGrade(mark[i]));
        }
    }
}
