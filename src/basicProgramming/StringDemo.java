package basicProgramming;

public class StringDemo {
    public static void main(String[] args) {
        /*String str1 = "abc";   // string literal
        String str2 = "abc";
        String str3 = "mihir";
        String str4 = new String("abc");   // by creating string object

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

        // intern()
        //str4.intern();  // strings are immutable
        System.out.println(str1 == str4.intern());


        String str5 = str1.concat(str2);
        System.out.println(str5);
        System.out.println(str1);
        */
        // methods
        String str1 = " Hello cdac ";
        String str2 = " java Programming ";
        String str3 = " HELLO CDAC ";
        String str4 = " cdac ";

        // checking the length
        System.out.println("the length of " + str1.length());

        // charAt
        System.out.println("the characrter at " + str1.charAt(2));

        // substrings
        System.out.println("the substring of str1 " + str1.substring(2,5));  // end index will be endindex-1

        // equals
        System.out.println("checking equality " + str1.equals(str3));

        // check equality by ignoring case
        System.out.println(str1.equalsIgnoreCase(str3));

        //index of character
        System.out.println("index of " + str1.indexOf("H"));

        // compareTo
        System.out.println("comparing str4 with str1 " + str4.compareToIgnoreCase(str1));

        // toLowerCase toUpperCase
        System.out.println(str4.toUpperCase() + " " + str3.toLowerCase());

        // trim
        System.out.println(str1.trim());

        // contains
        System.out.println(str1.contains("Hellooooo"));

        //replace
        System.out.println(str1.replace("Hello00000", "Mihir"));



    }
}
