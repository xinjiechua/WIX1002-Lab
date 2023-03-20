package L10Q2;

import java.util.*;
import java.io.*;

public class Q2 {

    public static void main(String[] args) {
        SubstitutionCipher plainToCipher = new SubstitutionCipher("plainText.txt", "cipherText.txt", 1);
        plainToCipher.plainToCipher();

        SubstitutionCipher cipherToPlain = new SubstitutionCipher("cipherText.txt", "decodedPlainText.txt", 1);
        cipherToPlain.cipherToPlain();
    }
}

interface MessageEncoder {

    String encode(String plainText);
    String decode(String cipherText);
}

class SubstitutionCipher implements MessageEncoder {

    String inputFileName;
    String outputFileName;
    int shift;

    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public void plainToCipher() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine()) {
                outputStream.println(encode(inputStream.nextLine()));
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void cipherToPlain() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine()) {
                outputStream.println(decode(inputStream.nextLine()));
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    @Override
    public String encode(String plainText) {
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            cipherText += (char) ((plainText.charAt(i) + shift) % 256);
        }
        return cipherText;
    }

    @Override
    public String decode(String cipherText) {
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int code = cipherText.charAt(i) - shift;
            if (code < 0) {
                code += 256;
            }
            plainText += (char) code;
        }
        return plainText;
    }
}
