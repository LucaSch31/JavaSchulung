package com.materna.exercises.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class lengthOfNames {
    public static void main(String[] args)  {
        String[][] array = {
                { "red",   "#FF0000" },
                { "green", "#00FF00" },
                { "blue",  "#0000FF" },
                { "red", "#NEWRED"},
                { "orange", "#00FF0F"},
                { "blue", "NEWBLUE"}
        };
        Map<String, String> colorMap = convertToMap( array );
        System.out.println( colorMap ); // {red=#FF0000, green=#00FF00, blue=#0000FF}
    }

    public static Map<String, String> convertToMap(String[][] array)  {
        Map<String, String> result = new HashMap<>(array.length);

        for(int i=0; i< array.length; i++)  {
            Objects.requireNonNull(array[i][0]);
            Objects.requireNonNull(array[i][1]);

            if(!result.containsKey(array[i][0])) {
                result.put(array[i][0], array[i][1]);
            }

            else {
                result.replace(array[i][0], array[i][1]);
            }
        }
        return result;
    }
}
