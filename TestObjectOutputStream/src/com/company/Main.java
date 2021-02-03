package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // Create an output stream for file object.dat
        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("object.dat")
        );
        // write a string, double value, and object to the file
        outputStream.writeUTF("John");
        outputStream.writeDouble(85.5);
        try {
            outputStream.writeObject(new java.util.Date());

        } catch (IOException e) {
            e.printStackTrace();
        }
        outputStream.close();
    }
}
