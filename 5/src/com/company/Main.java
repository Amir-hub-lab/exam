package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> rightPocket = new ArrayList<>();
        ArrayList<Object> leftPocket = new ArrayList<>();
        rightPocket.add(new Paper());
        leftPocket.add(new Something());
    }
}
interface Zvenit{
}
class Paper{}
class Something implements Zvenit{
}