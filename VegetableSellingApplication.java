package com.java.test;
import java.util.Scanner;

public class VegetableSellingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vegetables: ");
        int n = sc.nextInt();

        int[] vegetableId = new int[n];
        String[] vegetableName = new String[n];
        int[] quantity = new int[n];
        double[] rate = new double[n];

        System.out.println("\nEnter Vegetable Details:");

        for (int i = 0; i < n; i++) {

            System.out.println("\nVegetable " + (i + 1));

            System.out.print("Enter Vegetable ID: ");
            vegetableId[i] = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Vegetable Name: ");
            vegetableName[i] = sc.nextLine();

            System.out.print("Enter Available Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Enter Rate per kg: ");
            rate[i] = sc.nextDouble();
        }

        int choice = 1;

        while (choice == 1) {

            System.out.println("\n================================");
            System.out.println("     AVAILABLE VEGETABLES");
            System.out.println("================================");

            System.out.println("ID\tVegetable\tQuantity\tRate");

            for (int i = 0; i < n; i++) {

                if (quantity[i] > 0) {

                    System.out.println(
                        vegetableId[i] + "\t" +
                        vegetableName[i] + "\t\t" +
                        quantity[i] + " kg\t\tRs." +
                        rate[i]
                    );
                }
            }

            double totalBill = 0;

            System.out.print("\nEnter number of vegetables to purchase: ");
            int items = sc.nextInt();

            int i = 0;

            while (i < items) {

                System.out.print("\nEnter Vegetable ID: ");
                int id = sc.nextInt();

                int index = -1;
                int j = 0;

                while (j < n) {

                    if (vegetableId[j] == id) {
                        index = j;
                    }

                    j++;
                }

                if (index == -1) {

                    System.out.println("Invalid Vegetable ID.");

                } else {

                    if (quantity[index] == 0) {

                        System.out.println("Sorry! This vegetable is out of stock.");

                    } else {

                        System.out.print("Enter quantity required: ");
                        int required = sc.nextInt();

                        if (required <= 0) {

                            System.out.println("Quantity must be greater than 0.");

                        } else {

                            if (required > quantity[index]) {

                                System.out.println(
                                    "Only " + quantity[index] +
                                    " kg is available."
                                );

                            } else {

                                double cost = required * rate[index];

                                quantity[index] =
                                    quantity[index] - required;

                                totalBill = totalBill + cost;

                                System.out.println(
                                    vegetableName[index] +
                                    " Cost = Rs." + cost
                                );

                                i++;
                            }
                        }
                    }
                }
            }

            System.out.println("\n================================");
            System.out.println("        CUSTOMER BILL");
            System.out.println("================================");
            System.out.println("Total Bill = Rs." + totalBill);
            System.out.println("================================");

            System.out.print("\nEnter 1 for another customer or 0 to exit: ");
            choice = sc.nextInt();
        }

        System.out.println("\nThank you! Visit again.");

        sc.close();
    }
}

