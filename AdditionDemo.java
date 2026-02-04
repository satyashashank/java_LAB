class AdditionDemo {

    // Method to add TWO integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add THREE integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        AdditionDemo demo = new AdditionDemo();

        // Calling the version with 2 arguments
        int sum1 = demo.add(10, 20);
        
        // Calling the version with 3 arguments
        int sum2 = demo.add(10, 20, 30);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}