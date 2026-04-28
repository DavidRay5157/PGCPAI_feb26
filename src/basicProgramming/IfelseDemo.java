package basicProgramming;

public class IfelseDemo {
    public static void main(String[] args) {
        String weather = "sunny";

        if(weather == "rainy"){    // boolean true condition
            System.out.println("weather is rainy");
        }else if(weather == "sunny"){
            System.out.println("weather is sunny");
        }else{
            System.out.println("weather is snowy");
        }

        // ternary operator
        String res = (weather == "sunny") ? "weather is sunny" : (weather == "rainy") ? "weather is rainy" : "no weather";
        System.out.println(res);

        switch(weather){     // we're looking for a boolean true
            case "rainy":
                System.out.println("in switch weather is rainy");
                break;
            case "sunny":
                System.out.println("in switch weather is sunny");
                break;
            default:
                System.out.println("in switch weather is snowy");
        }
        switch(weather){
            case "rainy", "snowy", "sunny","summer" -> System.out.println("in switch weather is multiple weather");
            case "abc","xyz" -> System.out.println("in switch invalid weater input");
            default -> System.out.println("in switch default value");
        }

    }
}
