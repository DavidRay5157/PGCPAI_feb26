package basicProgramming;

public class FunctionDemo {
    public static void main(String[] args) {
        Mihir.print();
        hello();
        System.out.println(name("Manu Singh"));
        System.out.println(name("Mihir","cdac"));

        int num = 10;
        int n = modifier(num);
        System.out.println("OG value " + num);
        System.out.println("returned valuie " + n);

        int[] arr = {1,2,3};
        arrayModifer(arr);
        for(int i:arr){
            System.out.println(i);
        }

    }
     static void hello(){
        System.out.println("hello function");
        name("david")   ;
    }
    static String name(String inputName){
        return inputName;
    }
    static String name(String a, String b){
        return a+b;
    }

    static int modifier(int num){
        num += 1;
        System.out.println("inside function " + num);
        return  num;
    }

    static int[] arrayModifer(int[] arr){
        arr[0] = 999;
        return arr;
    }
}
class Mihir{
    static void print(){
        System.out.println("Hello Mihir");
    }
}
