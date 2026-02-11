class array1denhanced{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        for(int num:numbers){
            System.out.println(num);
        }
    }
}

class Array1DPrint {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

class Array1denhanced2{
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum=0;

        for (int num:numbers) 
        {
            sum=sum+num;
            
        }
        System.out.println("sum= "+sum);
    }
}


