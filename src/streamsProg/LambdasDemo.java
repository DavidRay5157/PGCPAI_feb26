package streamsProg;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

interface Add{
    int sum(int a, int b);
}

public class LambdasDemo {
    public static void main(String[] args) {
        // lambda arguments: expression   => for python
        // (parameters) -> { statements; }

        Add add = (a,b)->a+b;

        System.out.println(add.sum(1,2));

        // 3 types
        // 1. No Parameters
        Supplier<String> greet = () -> "Hello PGCP!";
        System.out.println(greet.get());

        // 2. one parameter
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // 3. multiple parameters
        BiFunction<Integer, Integer, Integer> add1 = (a,b) -> a+b;
        System.out.println(add1.apply(5,5));

    }
}
