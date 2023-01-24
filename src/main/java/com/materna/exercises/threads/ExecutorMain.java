package com.materna.exercises.threads;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecutorMain {




    public static void main(String[] args) {
//        ExecutorService executor = Executors.newCachedThreadPool();
//
//        executor.execute(r1);
//        executor.execute(r2);
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        executor.execute(r1);
//        executor.execute(r2);
//
//        executor.shutdown();
//
//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());

        Stream.generate(UUID::randomUUID)
                .map(UUID::toString)
                .limit(10)
                .parallel()
                .peek(e -> System.out.println(Thread.currentThread()))
                .collect(Collectors.joining("\n"));

    }





    static Runnable r1 = () -> {
        System.out.println( "1.1 " + Thread.currentThread().getName() );
        System.out.println( "1.2 " + Thread.currentThread().getName() );
    };


    static Runnable r2 = () -> {
        System.out.println( "2.1 " + Thread.currentThread().getName() );
        System.out.println( "2.2 " + Thread.currentThread().getName() );
    };
}
