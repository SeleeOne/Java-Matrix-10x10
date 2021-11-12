package com.company;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i =0; i<array.length; i++) {
            array[i][i] = i;
        }
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.println(array[i]);
            }
            System.out.println();
        }
    }
}
