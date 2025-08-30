class array{
    public static void main (String[] args){
        // int age[];//declaretion
        // age = new int [5];//allocation

        // 
        
        // int marks[]= {56,76,43,88,99};

        // System.out.println(marks[4]);

        // String names[]= {"tejas","tushar","sandesh","nikhil"};
        // for(int i= 0;i < names.length;i++){
        //     System.out.println("Name is a "+names[i]);
        // }
        // for(String name : names){
        //     System.out.println(name);
        // }

        int num[]= {43,54,6,7,8,9,8,-76,577,4,32,34,5,54,45,3,-23};
        int i;
        int sum = 0;
        for(i=0;i < num.length;i++){
            sum = sum + num[i];
            if(i >= num.length-1){
            System.out.println(sum);
            }
     }
        
    int min = Integer.MAX_VALUE;
    for (int number : num){
        if(number < min){
            min = number;
        }
    }
    System.out.println("Min is "+min);

    
    int max = Integer.MIN_VALUE;
    for (int number : num){
        if(number > max){
            max = number;
        }
    }
    System.out.println("max is "+ max);
}
}