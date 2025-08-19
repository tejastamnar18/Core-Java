class method1{
    public static void add()
        {
            int a = 10;
            int b = 20;
            int sum = a + b;
            System.out.println("Sum is: " + sum);

        }    
        public static void multiply(){
            int a = 5;
            int b = 4;
            int product = a * b;
            System.out.println("Product is: " + product);
        }
    public static void main(String [] args) {
        add(); // Method Calling Statement for add
        multiply();// Method Calling Statement for multiply
    }
}