import java.util.*;
import java.io.*;

class SearchSort1 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int a[], n;

        System.out.println("Enter the size of the array:");
        n = s.nextInt();               // FIXED: variable declared once
        
        a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i + ":");
            a[i] = s.nextInt();
        }

        int choice;
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Linear Search");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Display Array");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = s.nextInt();

            switch (choice) {

                // 🔍 LINEAR SEARCH
                case 1:
                    System.out.println("Enter element to search:");
                    int key = s.nextInt();
                    int flag = 0;

                    for (int i = 0; i < n; i++) {
                        if (a[i] == key) {
                            System.out.println("Element found at position " + i);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0)
                        System.out.println("Element not found!!");
                    break;

                // 🔄 BUBBLE SORT
                case 2:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (a[j] > a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Array sorted successfully!");
                    break;

                // 📜 DISPLAY ARRAY
                case 3:
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }
}
