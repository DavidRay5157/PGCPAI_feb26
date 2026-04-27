package basicProgramming;

public class FirstProgram {
    public static void main(String[] args){
        //variables
        // primitive datatypes
        byte var = 127;
        int _var1 = 10;
        long $var2 = 100000;
        float _23var3 = 3.14F;
        double var4 = 20.23;
        boolean var5 = true;
        // non primitive dtypes
        String var6 = "welcome to cdac";

        System.out.println("var1 " + _var1);
        System.out.println("$var2 " + $var2);
        System.out.println("var4 " + var4);
        System.out.println("var6 " + var6);

        // typecasting
        // implicit (widening, done automatically)
        int myInt = 5;
        double myDouble = myInt;
        System.out.println("myInt " + myInt);
        System.out.println("myDouble " + myDouble);

        // explicit (manual)
        double myDouble2 = 9.99;
        int myInt2 = (int)myDouble2;

        System.out.println("myInt2 " + myInt2);

        byte myByte = 127;
        int biggerNumber = myByte;

        float myFloat = 3.14F;
        int myINt3 = (int)myFloat;
        System.out.println("myFloat " + myFloat);
        System.out.println("myINt3 " + myINt3);

    }
}


