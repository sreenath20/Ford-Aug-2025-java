package com.demo.day8_collections_list;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String [] args){

        List<Integer> integerList = new ArrayList<Integer>();
//List
        // 1. elements are ordered
        // 2. elements are not sorted
        // 3. allows duplicates

        integerList.add(5);
        integerList.add(8);
        integerList.add(1);
        integerList.add(0);
        integerList.add(5);
        System.out.println(integerList);
        List<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("USA");
        nameList.add("India");
        System.out.println(nameList);


    }
}
