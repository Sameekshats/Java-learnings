import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int  x=scn.nextInt();
        System.out.println("Enter value of y: ");
        int  y=scn.nextInt();
        if(x>y)
        {
            System.out.println(x+"is Largest");
        }
          else{
            System.out.println(y+"is Largest");
        }
    }
}