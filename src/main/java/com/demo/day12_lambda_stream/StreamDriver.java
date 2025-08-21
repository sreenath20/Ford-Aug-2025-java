package com.demo.day12_lambda_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamDriver {
    public static void main(String[] args) {

        // Consumer
        Consumer<Employee> employeeConsumer = (e) -> System.out.println(e);
        employeeConsumer.accept(new Employee(1, "India", 5000.0));
        // Supplier
        Supplier<Employee> employeeSupplier = () -> new Employee(2, "Ford", 4444.4);
        System.out.println(employeeSupplier.get());
        // predicate to check if salary >= 5000
        Predicate<Employee> employeeSalaryPredicate = (e) -> e.getSalary() >= 5000.0;
        System.out.println("id 1 sal >= 5k :" + employeeSalaryPredicate.test(new Employee(1, "India", 5000.0)));
        System.out.println("id 2 sal >= 5k :" + employeeSalaryPredicate.test(employeeSupplier.get()));
        // function
        // get empl salary
        Function<Employee, Double> employeeSalryFunction = (e) -> e.getSalary();
        System.out.println(" emp salary of id 2: " + employeeSalryFunction.apply(employeeSupplier.get()));
        // get emaployee name
        Function<Employee, String> employeeNameFunction = (e) -> e.getName();
        System.out.println(" emp salary of id 2: " + employeeNameFunction.apply(employeeSupplier.get()));
        // increase salaru by 10 %
        Function<Employee, Employee> employeeSalaryHikeFunction = (e) -> {
            // do business logic here
            Employee employeeCopy = new Employee(e.getId(), e.getName(), e.getSalary()); // copy to avoid deep copy changes
            Double salary = employeeCopy.getSalary();
            employeeCopy.setSalary(salary * 1.1);
            return employeeCopy;
        };
        Employee employeeObj = new Employee(7, "Chennai", 7000.0);
        System.out.println(" emp salary of id 7 after hike by 10%: " + employeeSalaryHikeFunction.apply(employeeObj));
        System.out.println("Emp with id 7 :" + employeeObj);
        // pass lambda to function as parameter
        display(employeeSupplier);
        processEmployeeSalary(employeeSalaryHikeFunction);

        //Stream Processing of user defined data
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2, "AAA", 500.0));
        employeeList.add(new Employee(4, "EEE", 300.0));
        employeeList.add(new Employee(1, "JJJ", 400.0));
        employeeList.add(new Employee(9, "BBB", 100.0));
        // display emp havinf salary > 250
        employeeList
                .stream()
                .filter((e) -> e.getSalary() > 250)
                .forEach((e) -> System.out.println(e));
        // how many are getting salary > 250
        Long count = employeeList
                .stream()
                .filter((e) -> e.getSalary() > 250)
                .count();
        System.out.println("Emp count havinf sal > 250 :" + count);//
        // sort emp  by name
        Comparator<Employee> employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

        List<Employee> sortedEmployees = employeeList
                .stream()
                .sorted(employeeNameComparator)
                .toList();
        System.out.println("Sorted emp by name:" + sortedEmployees);
        System.out.println("After sorting emp collection remains same:" + employeeList);
        //estimate total salary employees by 5%
        List<Employee> employeListWithHike = employeeList
                .stream()
                .map((e) ->
                        {

                            //e.setSalary(e.getSalary() * 1.05); // avoid side effects to deep copy
                            Double salaryHike = e.getSalary() * 1.05;
                            return new Employee(e.getId(), e.getName(), salaryHike);
                        }
                )
                .sorted()
                .toList();

        Double totalEstimate = employeListWithHike.stream().mapToDouble((e) -> e.getSalary()).sum();
        System.out.println("Salary total = "+ totalEstimate);

        totalEstimate = employeeList
                .stream()
                .mapToDouble((e) ->
                        {
                            //e.setSalary(e.getSalary() * 1.05); // avoid side effects to deep copy
                            Double salaryHike = e.getSalary() * 1.05;
                            return salaryHike;
                        }
                )
                .sum();
        System.out.println("Salary total = "+ totalEstimate);

        System.out.println("After 5% hike" + employeListWithHike);
        System.out.println("Original list:" + employeeList);

    }

    static void display(Supplier<Employee> employeeSupplier) {
        System.out.println(employeeSupplier.get());
    }

    static void processEmployeeSalary(Function<Employee, Employee> employeeHikeFunction) {
        System.out.println(employeeHikeFunction.apply(new Employee(1, "Ford India", 50000.0)));
    }

}
