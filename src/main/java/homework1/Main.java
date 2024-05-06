package homework1;

import java.time.Year;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        Year year = Year.now();
        Product p1 = new Product();
        System.out.printf("-----------------------------------%n");
        System.out.printf("%-8s %-8s %-8s %s %n", "Name", "Qty", "Price", "Total");
        System.out.printf("%-8s %-8s %-8s %s %n", "----", "---", "-----", "-------");
        p1.yardSaleWholeSale("Rice" ,5, 20);


        System.out.println("\tThank you, Come Again");
        System.out.println();
        System.out.printf("Purchased on: %tA, %tB, %td, %tY",today,today,today,year);
        System.out.printf("%n-----------------------------------");


    }

}
