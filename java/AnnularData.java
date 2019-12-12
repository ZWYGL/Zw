package com.zhao;
import java.util.Scanner;
public class AnnularData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] annular = new int[num][num];
        int count = 0;
        int row_tag = 0;
        int col_tag = 0;
        int row = 0;
        int col = 0;
        while(count < num*num){
            count += 1;
            int flag = row_tag > col_tag ? row_tag : col_tag;
            if (row_tag % 2 == 0 && col_tag % 2 == 0){
                for (int i = 0; i < num - flag; i++){
                    if(row == 0  && col == 0){
                        annular[row][col] = 1;
                    }else{
                        annular[row][col] = annular[row][col - 1] + 1;
                    }
                    col += 1;
                }
                col -= 1;
                row += 1;
                row_tag += 1;
            }else if (row_tag % 2 != 0 && col_tag % 2 == 0) {
                for (int i = 0; i < num - flag; i++) {
                    annular[row][col] = annular[row - 1][col] + 1;
                    row += 1;
                }
                row -= 1;
                col -= 1;
                col_tag += 1;
            }else if(row_tag % 2 != 0 && col_tag % 2 != 0){
                for(int i = 0; i < num - flag; i++){
                    annular[row][col] = annular[row][col + 1] + 1;
                    col -= 1;
                }
                col += 1;
                row -= 1;
                row_tag += 1;
            }else if(row_tag % 2 == 0 && col_tag % 2 != 0){
                for(int i = 0; i < num - flag; i++){
                    annular[row][col] = annular[row + 1][col] + 1;
                    row -= 1;
                }
                row += 1;
                col += 1;
                col_tag += 1;
            }
        }
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                System.out.print(annular[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
