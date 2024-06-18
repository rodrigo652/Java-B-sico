package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if(ch == 'c') {
                list.add(new Product(name, price));
            } else if(ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));

            } else if(ch == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
