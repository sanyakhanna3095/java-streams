package com.bridgelabz.sampleQuestions;

import java.io.*;

public class FileStreamExample {
    public static void main(String[] args) {
        //Take absolute path reference of input and output files
        try (FileInputStream fis = new FileInputStream("/Users/sanyakhanna/Desktop/bridgelabz-workspace/Java-Streams/src/main/java/com/bridgelabz/sampleQuestions/input.txt");
             FileOutputStream fos = new FileOutputStream("/Users/sanyakhanna/Desktop/bridgelabz-workspace/Java-Streams/src/main/java/com/bridgelabz/sampleQuestions/output.txt")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


