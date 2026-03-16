public class MultiArrayTable {

    public static void main(String[] args) {

        int[][] table = {
            {9, 10, 4, 6, 2},
            {4, 0, 5, 2, 1},
            {12, 9, 3, 8, 6}
        };

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
