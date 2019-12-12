package com.zhao;

public class PascalTriangle {
    public static void main(String[] args){
        int[][] triangle = new int[10][];
        int len = triangle.length;
        for (int i = 0; i < len; i++){
            triangle[i] = new int[i + 1];
            for(int j = 0; j <= i; j++){
                if (j == 0 || i == j){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = get_data(triangle[i-1][j-1], triangle[i-1][j]);
                }
            }
        }
        for(int i = 0; i < len; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(triangle[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
    static int get_data(int data1, int data2){
        return data1 + data2;
    }
}
