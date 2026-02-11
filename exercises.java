import java.lang.System;
 import java.util.Scanner;

class Exercise{
    public static void main(String[] args)
    {
        String _name="Sameeksha";
        int age=20;
        float height=5.5f;
        double weight=55.63;
        System.out.println("NAME: "+_name);
         System.out.println("AGE: "+age);
         System.out.println("HEIGHT: "+height);
         System.out.println("WEIGHT: "+weight);
        
    }
}

class Exercise2{
    public static void main(String[] args) {
        int a= 15;
        int b= 25;
        int sum= a+b;
        int diff= a-b;
        double prod= a*b;
        double div=a/b;
        System.out.println("Sum is: "+sum);
        System.out.println("Difference is: "+diff);
        System.out.println("Product is: "+prod);
        System.out.println("Division is: "+div);
    }
}

class PNZ{

        public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  x=scn.nextInt();
        if(x>0){
        System.out.println(x+"is POSITIVE");
        }
        else if(x<0){
        System.out.println(x+"is NEGATIVE");
        }
        else if(x==0){
        System.out.println(x+"is ZERO");
    }
}
}

class largestof3{
     public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int  x=scn.nextInt();
        System.out.println("Enter value of y: ");
        int  y=scn.nextInt();
        System.out.println("Enter value of z: ");
        int  z=scn.nextInt();
        if(x>y&&x>z)
        {
            System.out.println(x+"is Largest");
        }
          else if(y>x&&y>z){
            System.out.println(y+"is Largest");
        }
        else {
            System.out.println(z+"is Largest");
        }
}
}
class TF{
    public static void main(String[] args){
String a=new String("Apple");
String b=new String("Apple");
System.out.println(a.equals(b));
}
}

class Main {
    public static void main(String[] args) {

        int[][] num = {
            {14, 23, 34, 45},
            {32, 11, 23, 29}
        };

        System.out.println(num[0][1]); // prints 23
    }
}

class Jarray{
    public static void main(String[] args) {
        int n=5;
        int[][] staircase=new int[n][];
        for(int i=0;i<n;i++){
            staircase[i]=new int[i+1];
            for(int j=0;j<=i;j++){
                staircase[i][j]=j+1;
            }
        }
        System.out.println("Staircase pattern:");
        for(int i=0;i<n;i++){
            for(int j=0;j<staircase[i].length;j++){
                System.out.print(staircase[i][j]+" ");
            }
            System.out.println();
        }
    }
}