public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrix =
                {{1, 2, 3},
                        {4, 5, 6,},
                        {7, 8, 9,}};// в первых квадратных скобках указывается строка [0] во вторых столбец [0] = 1
        /*System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][0]);

        String[] [] strings = new String[2][3];
        strings [0] [1] = "Hello";
        System.out.println(strings[0][1]);*/
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();


        }
    }
}
