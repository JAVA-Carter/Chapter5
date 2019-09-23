package assignment;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int entry1;
        int entry2;
        int entry3;
        String result;
        String result2;

        System.out.println("Please enter first number >>> ");
        entry1 = input.nextInt();
        System.out.println("Please enter first number >>> ");
        entry2 = input.nextInt();
        System.out.println("Please enter first number >>> ");
        entry3 = input.nextInt();


        if(entry1 > entry2 && entry1 > entry3){
            if(entry2 > entry3) {
                result = "Descending order " + entry1 + " " + entry2 + " " + entry3;
                result2 = "Ascending order " + entry3 + " " + entry2 + " " + entry1;
            }
            else {
                result = "Descending order " + entry1 + " " + entry3 + " " + entry2;
                result2 = "Ascending order " + entry3 + " " + entry1 + " " + entry2;
            }
            System.out.println(result + "\n" + result2);
        }
        else if (entry2 > entry1 && entry2 > entry3){
            if(entry1 > entry3){
                result = "Descending order " + entry2 + " " + entry1 + " " + entry3;
                result2 = "Ascending order " + entry3 + " " + entry1 + " " + entry2;
            }
            else {
                result = "Descending order " + entry2 + " " + entry3 + " " + entry1;
                result2 = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
            }
            System.out.println(result + "\n" + result2);
        }
        else if(entry3 > entry1 && entry3 > entry2){
            if(entry2 > entry1){
                result = "Descending order " + entry3 + " " + entry2 + " " + entry1;
                result2 = "Ascending order " + entry1 + " " + entry2 + " " + entry3;
            }
            else{
                result = "Descending order " + entry3 + " " + entry1 + " " + entry2;
                result2 = "Ascending order " + entry2 + " " + entry1 + " " + entry3;
            }
            System.out.println(result + "\n" + result2);
        }

    }
}
