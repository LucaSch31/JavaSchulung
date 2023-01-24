package com.materna.exercises.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class countLinesOfText {
    public static void main(String[] args) throws IOException{
        System.out.print(countLines("C:\\Users\\lschaefe\\IdeaProjects\\JavaSchulung\\src\\main\\resources\\stream.txt"));
    }

    public static int countLines(String path) throws IOException {
        return (int) Files.lines(Paths.get(path)).count();
    }
}
