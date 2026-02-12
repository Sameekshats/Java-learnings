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

class demo2{
   public static void main(String[] args){
    String[] playlists1=new String[3];
    playlists1[0]="song1";
    System.out.println(playlists1);
   } 
}

class demo3{
   public static void main(String[] args){
    String[] playlists1=new String[3];
    playlists1[0]="song1";
    System.out.println(playlists1[0]);
    playlists1[1]="song2";
    System.out.println(playlists1[1]);
   } 
}

class demo4{
   public static void main(String[] args){
    int[] arr={10, 20, 30, 40};
    int max=0;
    for (int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];

        }
    }
    System.out.println("max:"+max);
   }
 }