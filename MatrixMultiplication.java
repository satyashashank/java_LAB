class MatrixMultiplication {
    public static void main(String[] args) {
        // 1. Define two simple 2x2 matrices
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        // 2. Create a third matrix to store the result
        int[][] result = new int[2][2];

        // 3. The Multiplication Logic
        for (int i = 0; i < 2; i++) {       // Loop through rows of 'a'
            for (int j = 0; j < 2; j++) {   // Loop through columns of 'b'
                for (int k = 0; k < 2; k++) { // The "Math" loop
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // 4. Display the result
        System.out.println("Result of Multiplication:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
