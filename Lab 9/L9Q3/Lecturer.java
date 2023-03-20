package L9Q3;

/*
Derived a class Lecturer from class PersonProfile. The class has a list of course name, course code,
semester, session, credit hour and the number of students registered. All the information is retrieved
from a text file named lecturer.txt. (Please download the file from the Web site.). Write a method to
compute the credit hour. If the number of students is more than or equal to 150, multiply the credit hour
by 3, if less than 150 and more than or equal to 100, multiply the credit hour by 2. If less than 100 and
more than or equal to 50, multiply the credit hour by 1.5. Otherwise multiply the
credit hour by 1. The lecture object can display the lecturer profile as well as the
course profile with the updated credit hour. Create a Tester class to test the program
 */
import L9Q2.PersonProfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfile {

    private String[] courseName, courseCode;
    private int []semester,session,student;
    private double[]creditHour;
    private String fileName;

    public Lecturer(String name,String gender, String dob, String n){
        super(name,gender, dob);
        fileName = n;
        getInput();
    }

    public void getInput(){
        int i, cnt=0;

        try {
            Scanner input = new Scanner(new FileInputStream(fileName));
            while (input.hasNextLine()) {
                for(i = 0; i<6;i++){
                    input.nextLine();
                }
                cnt++;
            }
            input.close();
            courseCode = new String[cnt];
            courseName = new String[cnt];
            semester = new int[cnt];
            session = new int[cnt];
            student = new int[cnt];
            creditHour = new double[cnt];

            input = new Scanner(new FileInputStream(fileName));
            i = 0;
            while (input.hasNextLine()) {
                courseCode[i] = input.nextLine();
                courseName[i] = input.nextLine();
                semester[i] = Integer.parseInt(input.nextLine());
                session[i] = Integer.parseInt(input.nextLine());
                student[i] = Integer.parseInt(input.nextLine());
                creditHour[i] = Double.parseDouble(input.nextLine());
                i++;
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File was no found");
        }
    }

    public double getCreditHour(int num, double hour){
        if(num >= 150)
            return hour*3;
        else if(num >= 100)
            return hour*2;
        else if(num >= 50)
            return hour*1.5;
        else
            return hour;
    }

    public void display(){
        super.display();
        System.out.println("A list of courses taken");
        for(int i=0; i<courseCode.length; i++){
            System.out.print(courseCode[i] + " " + courseName[i] + " " + session[i] + " " + semester[i] + " ");
            System.out.println(student[i] + getCreditHour(student[i],creditHour[i]));
        }
    }
}
