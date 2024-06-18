package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sFileStr = sc.nextLine();

        File sourceFile = new File(sFileStr);
        String sFolderStr = sourceFile.getParent();

        boolean success = new File((sFolderStr + "\\out")).mkdir();

        String tFileStr = sFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sFileStr))){
            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tFileStr))){
                for(Product item: list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(tFileStr + "Created");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
