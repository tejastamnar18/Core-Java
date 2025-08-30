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

        int num[]= {43,54,6,7,8,9,8,76,5,4,32,34,5,54,45,3};
        int i;
        int sum = 0;
        for(i=0;i < num.length;i++){
            sum = sum + num[i];
            if(i >= num.length-1){
            System.out.println(sum);
            }
            
            }
}
}