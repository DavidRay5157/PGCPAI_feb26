package exceptionFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void validateAge(int age){
        if(age<18){
            // throw a exception
            throw new IllegalArgumentException("age is less than 18");
        }
        System.out.println("age is " + age);
    }
    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();

    }
    public static void main(String[] args) {



        try{
            String str = "abc";
            int res = 100/3;
            System.out.println(res);
            System.out.println(str.length());
            int[] ar = new int[1];
            ar[10] = 999;
            int i = Integer.parseInt(str);
            System.out.println("PGCP");

        }catch(Exception e){
            System.out.println(e);
        }
        // use of throw
        try{
            validateAge(16);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        // use of throws
        try{
            readFile("test.txt");
        }catch(IOException e){
            System.out.println(e);
        }finally{
            System.out.println("always run");
        }

        System.out.println("Normal program working");
    }
}
