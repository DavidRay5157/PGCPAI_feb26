package basicProgramming;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // creating strings that are mutable
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("world");
        StringBuilder sb3 = new StringBuilder("world");

        // append
        sb1.append(sb2);
        System.out.println(sb1);

        // insert
        sb1.insert(10, " java programming");
        System.out.println(sb1);

        // replace
        sb1.replace(10,15, "Python-acaconda");
        System.out.println(sb1);

        //delete
        System.out.println(sb1.delete(10,15));

        // reverse
        System.out.println(sb1.reverse());
    }
}
