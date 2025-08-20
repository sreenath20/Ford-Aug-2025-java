package com.demo.day11_streams;

import java.util.function.*;

public class LambdaDriver {
    public static void main(String[] args) {
// lambda functions / expressions

        DemoFunction demo = new Demo();
        demo.display();
        // lambda function
        DemoFunction function = () -> System.out.println("Ford India");
        function.display();
        // Builtin functional interfaces
// Consumer<T>
        Consumer<Integer> integerConsumer = (data) -> System.out.println(data);
        integerConsumer.accept(500);
        //Supplier
        String name = "Ford";

        Supplier<Double> piSupplier = () -> {
            System.out.println("Am inside lambda , name=" + name);
            return 3.14;
        };// no return is required if not using {}
        //  Supplier<Double> piSupplier = ()-> 3.14;
        System.out.println(piSupplier.get());
// predicate
        // check if given number is even?
        Predicate<Integer> evenPredicate = (number)->number%2 == 0;
        System.out.println(" is 7 even :"+evenPredicate.test(7));
        System.out.println(" is 122 even :"+evenPredicate.test(122));
        // Function
        Function<String,Integer> stringLengthFunction = (employeeName)->name.length(); // static typing
        System.out.println("Ford length is :"+stringLengthFunction.apply("88"));
        // BiFunction
        BiFunction<Integer,Integer,Double> powerBiFunction = (base,power)->Math.pow(base,power);
        System.out.println(" 2^3 = "+powerBiFunction.apply(2,3));

    }
}
