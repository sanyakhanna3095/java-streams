package com.bridgelabz.javaStreams;

import java.io.*;
import java.util.*;

public class WordCountTop5 {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "/Users/sanyakhanna/Desktop/bridgelabz-workspace/Java-Streams/src/main/java/com/bridgelabz/javaStreams/input.txt";
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split line into words and count occurrences
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency and display top 5 most frequent words
            map.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .limit(5)
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            // Handle file read exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}

