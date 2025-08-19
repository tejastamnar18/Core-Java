//!Types of Methods in Java
class method2{
    public static void add(){// Actual Argument Method
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void subtract(int x, int y){// Formal Argument Method 
        int sub = x - y;
        System.out.println("Subtraction is: " + sub);
    }
    public static void main(String [] args) {
        add(); // Method Calling Statement for add
        subtract(30, 10); // Method Calling Statement for Substract

    }

}