package basicProgramming;

public class LoopsDemo {
    public static void main(String[] args) {
        // for loop

        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        //while loop
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        // do-while
        int j = 11;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);
    }
}
