package assignment;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args){
        int minUsed;
        int txtSent;
        int gbUsed;
        String result = null;

        Scanner input = new Scanner(System.in);
        System.out.print("How many minutes do you plan to use >>> ");
        minUsed = input.nextInt();

        System.out.print("How many text msgs.are you going to use >>> " );
        txtSent = input.nextInt();

        System.out.print("How many Gigabytes are you going to use >>> ");
        gbUsed = input.nextInt();

        if (minUsed < 500 && txtSent == 0 && gbUsed == 0){
            result = "Plan A";
        }
        else if ( minUsed < 500 && txtSent >= 1 && txtSent <= 99 && gbUsed == 0){
            result = "Plan B";
        }
        else if (minUsed > 500 && txtSent <= 100 && gbUsed == 0){
            result = "Plan C";
        }
        else if (minUsed > 500 && txtSent > 100 && gbUsed >= 0 && gbUsed == 0){
            result = "Plan D";
        }
        else if(minUsed > 500 && txtSent > 100 && gbUsed >=1){
            if(gbUsed <2){
                result = "Plan E $79";
            }
            else if (gbUsed >=2){
                result = "plan E $87";
            }

        }
        else{
            System.out.println("That is not a plan");
        }
        System.out.println("The plan you need is " + result );
    }


}
