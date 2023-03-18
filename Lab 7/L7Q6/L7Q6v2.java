package L7Q6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class L7Q6v2 {
    public static void main(String[] args) {
        try{
            System.out.println("Product ID \tProductName\t  Quantity\tPricePerUnit\tTotal");
            Scanner sc = new Scanner(new FileInputStream("order.txt"));
            String [] order, product;
            String line, productName="";
            double price=0;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                order = line.split(",");
                int quantity = Integer.parseInt(order[2]);

                Scanner sc2 = new Scanner(new FileInputStream("product.txt"));
                while (sc2.hasNextLine()) {
                    line = sc2.nextLine();
                    product = line.split(",");
                    if (order[1].equals(product[0])) {
                        productName = product[0];
                        price = Double.parseDouble(product[2]);
                        break;
                    }
                }
                sc2.close();
                System.out.printf("%-13s %-13s %-10d %5.2f %12.2f\n",order[1],productName,quantity,price,quantity*price);
            }
        sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
}
