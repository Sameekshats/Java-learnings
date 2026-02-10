import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("The value of a is: "+a);
    }
}

class user_input_string{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("The name is: "+name);
    }
}

class user_input_float{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float f=scn.nextFloat();
        System.out.println("The value of f is: "+f);
    }
}

class user_input_addition{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter x value= ");
        float x=scn.nextFloat();
        System.out.print("Enter y value= ");
        float y=scn.nextFloat();
        float sum= x + y;
        System.out.println("The sum of 2 numbers is: "+sum);
    }
}

class user_input_double{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double d=scn.nextDouble();
        System.out.println("The value of d is: "+d);
    }
}
