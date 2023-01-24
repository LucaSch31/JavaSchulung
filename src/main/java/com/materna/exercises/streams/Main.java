package com.materna.exercises.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(persons("C:\\Users\\lschaefe\\IdeaProjects\\JavaSchulung\\src\\main\\resources\\persons.csv"));
    }

    public static String persons(String path) {
        try (Stream<String> stream = Files.lines(Paths.get(path));) {

             return stream
                    .skip(1)
                    .map(str -> {
                        String[] arr = str.split(",");
                        return new Person(arr[1], arr[0], Year.of(Integer.parseInt(arr[2].trim())));
                    })
                    .map(Record::toString)
                    .collect(Collectors.joining("\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
