package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> backpack1 = new ArrayList<>();
        ArrayList<Object> backpack2 = new ArrayList<>();
        ArrayList<Object> backpack3 = new ArrayList<>();
        for(int i = 0;i<80;i++){
            if(i<=20){
              backpack1.add(new Apple());
            }else if(i<=30&&i>20){
                backpack2.add(new Apple());
            }else{
                backpack3.add(new TennisBall());
            }
        }
        backpack1.add(new Papka());
        backpack2.add(new Papka());
        backpack3.add(new Papka());

        backpack1.add(new CocaCola());
        backpack3.add(new CocaCola());

        backpack2.add(new Water());

        System.out.println(backpack1.size());
        System.out.println(backpack2.size());
        System.out.println(backpack3.size());
    }
}
abstract class Ploskoe{}
abstract class Krugloe{}
abstract class Cilindricheskoe{}

class Apple extends Krugloe{

}
class TennisBall extends Krugloe{

}
class Papka extends Ploskoe{

}
class CocaCola extends Cilindricheskoe{

}
class Water extends Cilindricheskoe{

}