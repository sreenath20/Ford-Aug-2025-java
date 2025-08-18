package com.demo.day9_generics;

public class DiverGenerics {
    public static void main(String [] args){
        Box<Integer> integerBox =  new Box(30);
        System.out.println("operand 1 ="+integerBox.getData());

        Box<Double> doubleBox =  new Box(30.5);
        System.out.println("operand 1 ="+doubleBox.getData());

        Box<String> stringBox= new Box<>();
        stringBox.setData("Ford INDIA");
        System.out.println(stringBox.getData());

        Pair<Integer,Integer> integerPair = new OrderPair<>(8,2025);
        System.out.println("Value ="+integerPair.getValue());
        Pair<Integer,String> pincode = new OrderPair<>(57001,"Chennai");
        System.out.println("Pincode :"+pincode.getKey() + "Value:"+pincode.getValue());

        Pair<Integer,Box<Integer>> boxPair = new OrderPair<>(25,new Box<>(55));
        System.out.println(boxPair);


    }
}
