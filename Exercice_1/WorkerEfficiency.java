package Exercice_1;

import java.util.Scanner;

/**
 * WorkerEfficiency
 */
public class WorkerEfficiency {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter our worker time");

            int workedTime = scanner.nextInt();

            if (workedTime <= 3 && workedTime > 2) {

                System.out.println("the worker is said to be highly efficient.");

            } else if (workedTime <= 4 && workedTime > 3) {

                System.out.println("the worker is ordered to improve speed.");

            } else if (workedTime <= 5 && workedTime > 4) {

                System.out.println("the worker is given training to improve his speed and if the time taken.");

            } else if (workedTime > 5) {

                System.out.println("Sorry, you have to leave the company.");

            }
        }

    }
}