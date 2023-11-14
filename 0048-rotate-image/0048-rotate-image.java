class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        int[][] copy = matrix.clone();
        for (int i = 0; i < len; i++) copy[i] = matrix[i].clone();
        
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // System.out.print(copy[i][j]);
                // System.out.print(",");
                matrix[j][(len-1) - i] = copy[i][j];
            }
            // System.out.println();
        }
    }
}