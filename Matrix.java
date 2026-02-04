class Matrix {
    public static void main(String[] args) {
        
        // 1. Create a simple 2x2 matrix
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        // 2. The easiest way to display it
        for (int[] row : matrix) {       // Pick up a row
            for (int number : row) {     // Pick up a number from that row
                System.out.print(number + " ");
            }
            System.out.println();        // Jump to next line
        }
    }
}