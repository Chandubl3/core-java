package com.xworkz.taskapp;

public class Array {

	public static void main(String[] args) {
        int sum = 0;
        int[][] myFirst2DArray = {
                                    { 3, 5, 1, 9 },
                                    { 10, 15, 3, 0  },
                                    { 1, 11, 31, 90 },
                                    { 2, 51, 1, 9 }
                                };

        for (int[] row:myFirst2DArray) {

            for (int columnElement : row) {
                sum+=columnElement;
            }
            
        }
        System.out.println(sum);
    }
}
