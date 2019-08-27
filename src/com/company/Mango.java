package com.company;

public class Mango extends Fruit implements Printable  {

    private String country;


    public String getCountry() {
        return country = "Kongo";
    }

    @Override
    public void print() {
        System.out.println("Колл-во = " + getAmount()+ "  Цена = " +getPrice() + " Страна = " +getCountry());
    }
}
