// DJ Trost | CSD 420 | Assignment 1
// Reads data written to TrostDataFile.dat

import java.io.*;
import java.time.LocalDate;

public class ReadData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("TrostDataFile.dat"));
        ) {
            int[] intArray = (int[])(input.readObject());
            double[] doubleArray = (double[])(input.readObject());
            LocalDate currentDate = (LocalDate)(input.readObject());

            System.out.println("Array of Integers:");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + " ");
            }
            System.out.println("\n");

            System.out.println("Array of Doubles:");
            for (int i = 0; i < doubleArray.length; i++) {
                System.out.print(doubleArray[i] + " ");
            }
            System.out.println("\n");

            System.out.print("Today is: " + currentDate);

            input.close();
        }
    }
}
