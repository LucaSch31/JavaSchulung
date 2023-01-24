package com.materna.exercises.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countLinesWithDig {
    public static void main(String[] args) throws IOException{
        System.out.print(sortLines("C:\\Users\\lschaefe\\IdeaProjects\\JavaSchulung\\src\\main\\resources\\stream.txt"));
    }
    public static boolean countLines(String path) {

        try {
            return Files.lines(Paths.get(path)).anyMatch(str -> {
                for(char c: str.toCharArray())  {
                    if(Character.isDigit(c))    {
                        return true;
                    }
                }
                return false;
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String collectLines(Stream stream)   {
        return stream.collect(Collectors.joining(",")).toString();
    }

    public static String sortLines(String path) {
        try {
            return collectLines(Files.lines(Paths.get(path)).sorted(Comparator.comparing(String::length)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
