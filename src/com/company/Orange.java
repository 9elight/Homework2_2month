package com.company;

public class Orange extends Fruit implements Printable{
    private int weight;

    public int getWeight() {
        return weight = 100;
    }

    @Override
    public void print() {
        System.out.println("Колл-во = " + getAmount()+ "  Цена = " +getPrice() + "  Вес = "+getWeight());
    }
}
