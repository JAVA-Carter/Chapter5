package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        // Triangle program
        // Solving for right, isosceles, and equilateral triangles
        // Solve for Triangle Sides, perimeter, area
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("What are you solving for? \n 1 - for Right Triangle \n " +
        "2 - for Isosceles \n 3 - for Equilateral \n choice >>> ");
        choice = input.nextInt();

        if (choice == 1){
            rightTriangle();
        }
        else if (choice == 2){
            Isosceles();
        }
        else if (choice == 3){
            solveArea();
        }
    }
    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.print("Which side do you want to solve for?\n" +
        "A-side \n B-side \n C-side \n choice >>>>");
        choice = input.next();
        if(choice.equalsIgnoreCase("A")){
            System.out.print("Please enter side B >>>>");
            side1 = input.nextDouble();
            System.out.print("Please enter side C >>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else if(choice.equalsIgnoreCase("B")){
            System.out.print("Please enter side A >>>>");
            side1 = input.nextDouble();
            System.out.print("Please enter side C >>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else{
            System.out.print("Please enter side A >>>>");
            side1 = input.nextDouble();
            System.out.print("Please enter side B >>>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2);
        }

    }
    public static void rightTriangleMathAB(double side1, double side2, String choice){
        double notC;
        notC = java.lang.Math.round(Math.sqrt((side2 * side2) - (side1 * side1)));
        System.out.println("Your answer is " + notC);

    }
    public static void rightTriangleMathC(double side1, double side2){
        double C;
        C = java.lang.Math.round(Math.sqrt((side2 * side2) + (side1 * side1)));
        System.out.println("Your answer is " + C);
    }
    public static void Isosceles(){
        String choice = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to find:" +
                "\n A-perimeter \n B-Height \n C-Triangle \n choice >>> ");
        choice = input.next();

        if((choice.equalsIgnoreCase("A"))){
            solvePerimeter();
        }
        else if((choice.equalsIgnoreCase("B"))){
            solveHeight();
        }
        else if((choice.equalsIgnoreCase("C"))){
            solveArea();
        }
    }
    public static void solvePerimeter(){
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double side3;

        System.out.print("Please enter side A >>>> ");
        side1 = input.nextDouble();
        System.out.print("Please enter side B >>>> ");
        side2 = input.nextDouble();
        System.out.print("Please enter side C >>>> ");
        side3 = input.nextDouble();

        solvePerimeterMath(side1, side2, side3);

    }
    public static void solvePerimeterMath(double side1, double side2, double side3){
        double per;
        per = side1 + side2 + side3;
        System.out.println("Your answer is " + per);
    }

    public static void solveArea(){








    }
    public static void solveHeight(){
        double side;
        double base;
        double height;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter side >>>> ");
        side = input.nextDouble();
        System.out.print("Please enter base >>>> ");
        base = input.nextDouble();

        height = Math.sqrt((side * side) - (base * base)/ 4);

        System.out.println("The height is " + height);

    }
}
