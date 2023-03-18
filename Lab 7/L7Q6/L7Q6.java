package L7Q6;

import java.util.Scanner;
import java.io.*;

public class L7Q6 {
    public static void main(String[] args) {
        try{
            System.out.println("Product ID    \tProductName\t\tQuantity\tPricePerUnit\tTotal");
            Scanner sc = new Scanner(new FileInputStream("order.txt"));
            String temp, productName = "";
            int quantity;
            double price = 0;
            String[]order, product;
            while(sc.hasNextLine()){
                temp = sc.nextLine();  //read each line
                order = temp.split(",");   //split the first line
                quantity = Integer.parseInt(order[2]);  //third column of first line

                Scanner sc2 = new Scanner(new FileInputStream("product.txt"));
                while(sc2.hasNextLine()){
                    temp = sc2.nextLine();
                    product = temp.split(",");
                    if(order[1].equals(product[0])){
                        productName = product[1];
                        price = Double.parseDouble(product[2]);
                        break;
                    }
                }
                sc2.close();
                System.out.printf("%-10s%-20s", order[1], productName);
                System.out.printf("\t%-10d\t%6.2f\t%7.2f\n",quantity,price,quantity*price);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
}
