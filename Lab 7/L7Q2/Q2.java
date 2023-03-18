package L7Q2;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

public class Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter out = new PrintWriter("index.htm");
            while(in.hasNextLine())
                out.println(in.nextLine());
            out.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }

}
