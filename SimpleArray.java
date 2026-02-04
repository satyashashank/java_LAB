 class SimpleArray {
    public static void main(String[] args) {
        
        // 1. Create the array. Think of this as building 5 empty boxes.
        int[] myNumbers = new int[5];

        // 2. Put values into the boxes (Assigning)
        myNumbers[0] = 10;
        myNumbers[1] = 20;
        myNumbers[2] = 30;
        myNumbers[3] = 40;
        myNumbers[4] = 50;

        // 3. Print the values to the screen
        System.out.println("Locker 0 contains: " + myNumbers[0]);
        System.out.println("Locker 1 contains: " + myNumbers[1]);
        System.out.println("Locker 2 contains: " + myNumbers[2]);
        System.out.println("Locker 3 contains: " + myNumbers[3]);
        System.out.println("Locker 4 contains: " + myNumbers[4]);
    }
}