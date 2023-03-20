package L9Q2;

/*Define a class PersonProfile. The class has a name, gender and date of birth. The class consists of a
constructor and a display method. Derived a Student class from PersonProfile. The Student class has a
list of course name and course code, semester, session, mark and a file name. The class consists of a
constructor with student profile and file input name. All the information is retrieved from a text file
named course.txt. (Please download the file from the Web site.). Create a getGrade method for the mark base
on the table below:
The Student object can display the student profile as well as course details and the result in grade.
Create a Tester class to test the program.
*/

public class PersonProfile {
    private String name, gender, dob;

    public PersonProfile(String a, String b, String c){
        name = a;
        gender = b;
        dob = c;
    }

    public void display(){
        System.out.println("Full Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
    }
}
