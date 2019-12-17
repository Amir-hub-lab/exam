package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        for(int i =0 ;i<15;i++){
            if(i<=10){
                books.add(new Book("БИ"+i,i,100,50));
            }else{
                books.add(new Book("БИ"+i,i,100,0));
            }
        }
        for(int i =0 ;i<15;i++){
            System.out.println((books.get(i)).toString());
        }
    }
}
class Book{
    private String ID;
    private int year;
    private double price;
    private double skidka;

    public Book(String ID, int year, double price, double skidka) {
        this.ID = ID;
        this.year = year;
        this.price = price;
        this.skidka = skidka;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSkidka() {
        return skidka;
    }

    public void setSkidka(double skidka) {
        this.skidka = skidka;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID='" + ID + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", prise with skidka=" + (price-(price/100*skidka)) +
                '}';
    }
}