package com.materna.exercises.arrays;

public class shortestNames {
    public static void main(String[] args) {
        String[] pers = new String[] {"Albert Tross", "Blowfish", "Nick Olaus", "Jo Ker"};
        System.out.print(shortestName(pers));
    }

    static String shortestName(String... names)    {

        if(names==null) { return "nicht akzeptiert!"; }

        if(names.length!=0)   {
            String output = names[0];
            for(int i=1; i<names.length; i++)  {
                if(names[i]==null) { return "nicht akzeptiert!"; }
                names[i] = names[i].split(" ")[0];
                output = shortest(output, names[i]);
            }
            return output;
        }

        else {
            return "";
        }
    }

    public static String shortest(String str1, String str2)    {
        if(str1.length()>str2.length())     {
            return str2;
        }
        else {
            return str1;
        }
    }
}
