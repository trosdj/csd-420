// DJ Trost | CSD 420 | Assignment 1
// Writes data to TrostDataFile.dat

import java.time.LocalDate;
import java.io.*;

public class WriteData {
    public static void main(String[] args) throws IOException {
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];

        LocalDate currentDate = LocalDate.now();

        // Populate the arrays 
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 10);
        }

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (int)(Math.random() * 10);
        }

        // Write data to TrostDataFile.dat
        try (
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("TrostDataFile.dat")); 
        ) {
            output.writeObject(intArray);
            output.writeObject(doubleArray);
            output.writeObject(currentDate);

            output.close();
        }
    }
}