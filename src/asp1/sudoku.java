package asp1;

import java.util.Arrays;

public class sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                        {8,3,5,4,1,6,9,2,7},
                        {2,9,6,8,5,7,4,3,1},
                        {4,1,7,2,9,3,6,5,8},
                        {5,6,9,1,3,4,7,8,2},
                        {1,2,3,6,7,8,5,4,9},
                        {7,4,8,5,2,9,1,6,3},
                        {6,5,2,7,8,1,3,9,4},
                        {9,8,1,3,4,5,2,7,6},
                        {3,7,4,9,6,2,8,1,5}};

        /*
        int[][] s = getSquare(1,1, sudoku);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println("");
        }
         */

        System.out.println(checkCols(sudoku) && checkRows(sudoku) && checkSquares(sudoku));
    }

    public static int countInArray(int x, int[] arr) {
        int count = 0;
        for(int i : arr) {
            if (i == x)
                count++;
        }
        return count;
    }

    public static boolean checkRows(int[][] board) {
        for(int[] row : board) {
            for(int i = 1; i <=9; i++) {
                if(countInArray(i, row) != 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean checkCols(int[][] board) {
        int[] col = new int[9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                col[j] = board[j][i];

            }
            for(int n = 1; n <=9; n++) {
                if(countInArray(n, col) != 1)
                    return false;

            }

        }
        return true;
    }

    public static int[][] getSquare(int r, int c, int[][] board) {
        int[][] square = new int[3][3];
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                square[i][j] = board[i+(r*3)][j+(c*3)];
            }
        }
        return square;
    }

    public static int countInSquare(int[][] s, int x) {
        int count = 0;
        for(int i = 0; i<3;i++) {
            for(int j = 0; j<3;j++) {
                if(s[i][j] == x)
                    count++;

            }
        }
        return count;
    }

    public static boolean checkSquares(int[][] board) {
        for(int i = 0; i<3;i++) {
            for(int j = 0; j<3;j++) {
                int[][] s = getSquare(i,j,board);
                for(int n = 1; n<=9;n++) {
                    if(countInSquare(s, n) != 1)
                        return false;
                }
            }
        }
        return true;
    }


}
