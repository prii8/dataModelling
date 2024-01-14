package org.example;

import org.example.healthcare.HealthcareParser;

public class Main {
    public static void main(String[] args) {
        // Provide the absolute path to your text file
        String filePath = "C:/Users/priya/Desktop/dataModelling/src/main/resources/auth.txt";

        // Parse the text file and create JSON objects
        HealthcareParser.parseAndPrint(filePath);
    }
}
