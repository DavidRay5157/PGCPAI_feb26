package streamsProg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // 1. from Arrays
        String[] array = {"java","c++","python"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // 2. From collections
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numbersStream = numbers.stream();

        // 3. using Stream.of()
        Stream<String> streamOf = Stream.of("java","c++","python");
        streamOf.forEach(System.out::println);

        // 4. using Stream.generate()
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);
        randomNumbers.forEach(System.out::println);

        // 5. using stream.iterate()
        Stream<Integer> evenNumber = Stream.iterate(2, n->n+2).limit(3);

        // 6. from String characters
        IntStream charStream = "Hello".chars();

        // 7. range of numbers
        IntStream range = IntStream.range(1,10);


        // INtermediate  = processing the elements but not having any ending conditions, example = 2%2
        List<String> names = Arrays.asList("java","c++","python","Ruby","React","Node");

        // 1. Filter() = when you want to filter based on a condition
        System.out.println("Names starting with j OR R");
        names.stream()
                .filter(name -> name.startsWith("j") || name.startsWith("R")) // processing
                .forEach(System.out::println);   // terminating point


        // 2. map() = transformation of values
        System.out.println("Transform all in UpperCase");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 3. sorted()
        System.out.println("Sort the elements");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // 4. Distinct() = removes duplicates
        System.out.println("Removing Duplicates");
        List<Integer>  numbersWithDuplicates = Arrays.asList(1,2,3,4,5,1,2,5);
        numbersWithDuplicates.stream()
                .distinct()
                .forEach(System.out::println);

        // 5. limit() => limiting number of elements
        numbersWithDuplicates.stream()
                .limit(3)
                .forEach(System.out::println);

        // 6. skip() => skip the first element
        System.out.println("skip method");
        names.stream()
                .skip(3)
                .forEach(System.out::println);


        // terminal methods = is the ending point for a stream, where you show O/P
        List<Integer>  numbersForTerminal = Arrays.asList(1,2,3,4,5,6,7,8,9);


        //1. forEach Loop
        System.out.println("using ForEach Loop");
        numbersForTerminal.stream().forEach(System.out::println);

        //2. collect() => collecting the elements into a collection
        System.out.println("using collect function");
        List<Integer> evenNumbers = numbersForTerminal.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("even numbers data " + evenNumbers);

        // 3. count()
        System.out.println("count function");
        long count = numbersForTerminal.stream()
                .filter(n -> n%2 == 0)
                .count();
        System.out.println("count is " + count);

        // 4. reduce() => reducing to a single value, example [1,2,3] = 6
        System.out.println("reduce function");
        Optional<Integer> sum = numbersForTerminal.stream().reduce((a, b) -> a+b);
        sum.ifPresent(System.out::println);

        System.out.println("another way");
        int sum1 = numbersForTerminal.stream().reduce(1,(a, b) -> a+b);
        System.out.println(sum1);


        // streams can be used only once
        List<String> items = Arrays.asList("java","c++","python","Ruby","React","Node");

        // create the stream
        Stream<String> myStream = items.stream();

        // first terminal function
        System.out.println("first use of terminal point " + myStream.count());
        // this below will throw an exception
        System.out.println("second use " + myStream.anyMatch(s -> s.startsWith("j")));
    }
}
