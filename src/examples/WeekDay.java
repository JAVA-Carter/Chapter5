package examples;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        String day;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day of the week >>>");
        day = input.next();


        switch(day){
            case "Monday":
                result = "Shell Practice";
                break;
            case "Tuesday":
                result = "Full pad practice";
                break;
            case "Wednesday":
                result = "Helmet only practice";
                break;
            case "Thursday":
                result = "Shell practice with team dinner";
                break;
            case "Friday":
                result = "Friday night lights, GAMEDAY";
                break;
            default:
                result = "Invalid";
        }
        System.out.print(result);
    }

}
