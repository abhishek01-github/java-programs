import java.util.*;
public class SudokuSolver {
    public static void main(String[] args) {
        
    }
    static void solver(int[][] sudoku,int r,int c,int num,boolean solvable){

    }
    static void check(int[][] sudoku,int r,int c,int num){
        if(num>9){
            return;
        }
        for (int i = 0; i < sudoku.length; i++) {
            if(sudoku[r][i]==num)
        }
    }
    static void display(int[][] sudoku){
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
