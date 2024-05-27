package Basics;

public class SwitchCase {
    public static void main(String[] args) {
        int dayInWeek = 8;

        switch (dayInWeek%7) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
            System.out.println("Sunday");
                break;
        }



        // Alarm Example
        // Old Switch
        System.out.println("Old Switch");
        String day = "Sunday";

        switch(day)   {
            case "Saturday", "Sunday":
                System.out.println("6 AM");
                break;
            case "Monday":
                System.out.println("8 AM");
                break;
            default:
                System.out.println("7 AM");
        }

        // Different way to use switch
        System.out.println("Different way to use switch");
        switch (day) {
            case "Saturday", "Sunday" -> System.out.println("6 AM");
            case "Monday" -> System.out.println("8 AM");
            default -> System.out.println("7 AM");
        }

        // Save a value from switch
        System.out.println("Save a value from switch");
        String result;
        switch (day) {
            case "Saturday", "Sunday" -> result ="6 AM";
            case "Monday" -> result = "8 AM";
            default -> result = "7 AM";
        }
        System.out.println(result);

        // Return a value from switch
        System.out.println("Return a value from switch");
        result = switch(day)    {
            case "Saturday", "Sunday" -> "6 AM";
            case "Monday" -> "8 AM";
            default -> "7 AM";
        };
        System.out.println(result);

        // Using Yield
        System.out.println("Using Yield");
        result = switch(day)    {
            case "Saturday", "Sunday": yield "6 AM";
            case "Monday": yield "8 AM";
            default: yield "7 AM";
        };
        System.out.println(result);        
    }
}
