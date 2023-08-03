public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {  { 3, 2, 1, 7 },
					        { 9, 11, 5, 4 },
					        { 6, 0, 13, 17 },
					        { 7, 21, 14, 15 } };

        int m[] = matrix[1];

        for(int i = 0; i<m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
