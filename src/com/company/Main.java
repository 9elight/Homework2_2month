package com.company;


public class Main {
    public static Object createObject(String className){

        switch (className){
            case "Orange":
                Orange orange = new Orange();
                orange.print();
                return orange;

            case "Apple":
                Apple apple = new Apple();
                apple.print();
                return apple;

            case "Mango":
                Mango mango = new Mango();
                mango.print();
                return mango;


        }
        return createObject(className);
    }

    public static void main(String[] args){

    createObject("Mango");
    createObject("Apple");
    createObject("Orange");


    }
}
