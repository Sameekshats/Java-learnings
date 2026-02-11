class rectanglepattern{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Pascaltriangle{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){

                System.out.print(" ");
            }
            int no=1;
            for(int j=0;j<=i;j++){
                System.out.print(no+" ");
                no=no*(i-j)/(j+1);

            }
            System.out.println();
        }
    }
}