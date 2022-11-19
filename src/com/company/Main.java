package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello Java!");
//        String name = "Sabeel";
//        System.out.println(name);
//        String neighbour = "Akku";
//        System.out.println(neighbour);
//        int num = 37;
//        System.out.println(num);
//        String friend = neighbour;
//        System.out.println(friend);


        //Types in Java -----------------

        // byte 1 [-128 to 127]
        // short 2 []
        // int -4
        // long -8
        // float - 4 ,3.14205
        // double - 8
        // char -2 a,b,c
        // Boolean - 1 true/false

        byte age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14205F;
        char letter = 'S';
        Boolean isAdult = true;


        // Non - Primitive type
//        String name = new String("Aman");
//        String friend = new String("Aku");
//        System.out.println(name.length());
//        System.out.println(friend);


        // STRING METHODS ------------------

        //concatenate
        String firstName = "Sabeel";
        String lastName = "Khan";

        String fullName = firstName+"  "+lastName;
//
//        System.out.println(fullName);

//        charAt()

//        System.out.println(fullName.charAt(0));

        //replace()

//        String name=fullName.replace('e','x');
//        System.out.println(name);
//        System.out.println(fullName); //strings are immutable in Java


        //substring()

//        System.out.println(fullName.substring(0,6));
          int[] marks = new int[3];
          marks[0]=97;
          marks[1]=98;
          marks[2]=88;
        //sort

        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++){
              System.out.println(marks[i]);
        }
    }
}
