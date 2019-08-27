package com.company;

public class Apple extends Fruit implements Printable{
    private String appleType;

    public String getAppleType() {
        return appleType = "Macintosh";
    }


    @Override
    public void print() {
        System.out.println("Колл-во = " + getAmount()+ "  Цена = " +getPrice() + " Сорт =  " + getAppleType());
    }
}
