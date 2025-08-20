package com.demo.day11_streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamDriver {
    public static void main(String[] args) {

        // Stream API
        List<String> names = new ArrayList<>();
        names.add("India");
        names.add("USA");
        names.add("Russia");
        names.add("Japan");
        // get length of all names?
        // MAP api = transform data
        Function<String,Integer> lengthFunction = (name) -> name.length();
        Consumer<Integer> intConsumer = (data) -> System.out.println(data);
        names
                .stream()
                .map(lengthFunction)
                .forEach(intConsumer);

        for(String name : names){

        }
        // get sum of all names
        // Terminal Sum()
        Integer sum = names.stream().mapToInt((name) -> name.length()).sum();
        System.out.println("Total length of all names = " + sum);
        //names.clear(); // delete all names
        // Terminal min()
        OptionalInt minOptional = names.stream().mapToInt((name) -> name.length()).min();

        if (minOptional.isPresent())
            System.out.println("Min name lenght is " + minOptional.getAsInt());
        else
            System.out.println("Min value could not be found , may be list is empty");
// Terminal max()
        OptionalInt maxOptional = names.stream().mapToInt((name) -> name.length()).max();

        if (maxOptional.isPresent())
            System.out.println("Max name lenght is " + maxOptional.getAsInt());
        else
            System.out.println("Max value could not be found , may be list is empty");
        // Terminal collect
        List<Integer> nameLengthList = names.stream().map((name) -> name.length()).toList();
        System.out.println(nameLengthList);
        // Find all names having length > 4
        // filter
        names.stream().filter((name) -> name.length() > 4).forEach((name) -> System.out.println(name));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(5);
        integerList.add(8);
        integerList.add(1);
        // print all even numbers
        integerList.stream().filter((number) -> number % 2 == 0).forEach((n) -> System.out.println(n));
        // sort data
        integerList.stream().sorted().forEach((n) -> System.out.println(n));
        System.out.println("int list is not modified" + integerList);
        // sort even data
        System.out.println("Sorted even numbers:");
        integerList.stream()
                .filter((number) -> number % 2 == 0)
                .sorted()
                .forEach((n) -> System.out.println(n));
        System.out.println("int list is not modified" + integerList);
        Collections.sort(integerList);
        System.out.println("After collection sort() :"+ integerList);
        // find the square of all numbers in a list
        Function<Integer,Integer> squareFunction = (n)->n*n;

        integerList // 1. source
                .stream() // stream instance
                .map(squareFunction) // intermediate operation
                .forEach((n)-> System.out.println(n)); // terminal

    }
}
