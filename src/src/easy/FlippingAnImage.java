package src.easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int end = A[i].length - 1;
            int j = 0;
            while (j < end) {
                int temp = A[i][end];
                A[i][end] = A[i][j];
                A[i][j] = temp;
                j++;
                end--;
            }
            
            for (int k = 0; k < A[i].length; k++) {
                A[i][k] ^= 1;
            }
        }
        
        return A;
    }
    
    public static void main(String[] args) {
        int testSet[][] = { {1, 1, 0},
                            {1, 0, 1},
                            {0, 0, 0}
                          };
        FlippingAnImage testObj = new FlippingAnImage();
        int resultSet[][] = testObj.flipAndInvertImage(testSet);
        for (int dim1[] : resultSet) {
            for (int num : dim1) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

