package at.technikum.basics;

import java.util.Scanner;

public class TryResource {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
        } finally {
            System.out.println("test");
            scanner.close();
        }

        try (Scanner scanner2 = new Scanner(System.in)) {
            int i = scanner.nextInt();
        }
    }
}
