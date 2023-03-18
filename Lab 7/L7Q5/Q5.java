package L7Q5;

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream sc = new ObjectInputStream(new FileInputStream("person.dat"));
            int cnt = sc.readInt();
            String[]name = new String[cnt];
            int[]age = new int[cnt];
            char[]gender = new char[cnt];

            try {
                int i = 0;
                while (true) {
                    name[i] = sc.readUTF();
                    age[i] = sc.readInt();
                    gender[i] = sc.readChar();
                    i++;
                }
            } catch(EOFException ignored){}

            for(int i=0;i< name.length-1;i++){    //pass
                for(int j=0; j<name.length-1-i;j++){
                    if(name[j].compareToIgnoreCase(name[j+1]) > 0){
                        String tempN = name[j];
                        name[j] = name[j+1];
                        name[j+1] = tempN;

                        int tempA = age[i];
                        age[i] = age[i+1];
                        age[i+1] = tempA;

                        char tempG = gender[i];
                        gender[i] = gender[i+1];
                        gender[i+1] = tempG;
                    }
                }
            }

            for(int k=0; k<name.length;k++){
                System.out.print("Name: " + name[k] + "Age: " + age[k] + " Gender:");
                if(gender[k] == 'M')
                    System.out.println("Male");
                else
                    System.out.println("Female");
            }

        sc.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }


    }

}

/* compareTo() Method
 A value less than 0 is returned if the string is less than the other string (less characters)
 A value greater than 0 if the string is greater than the other string (more characters).

 */
