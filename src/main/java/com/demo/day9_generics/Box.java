package com.demo.day9_generics;

public class Box<T> {

    private T data;


    public Box() {
    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                '}';
    }
}
