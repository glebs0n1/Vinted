package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.*;


public class Main {
    public Main() {

    }

    public static void main(String[] args) {

        int[] array = new int[21];
        readFile(array);
        Arrays.sort(array);
        writeArray(array);
    }

    private static void writeArray(int[] x) {
        try {
            FileOutputStream fileout = new FileOutputStream("output.txt");

            PrintStream myOutput = new PrintStream(fileout);
            for (int i = 0; i < 21; i++) {

                myOutput.println(x[i]);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
        private static void readFile(int[] x) {
        int i = 1;


        try {
            FileInputStream fitream = new FileInputStream("input.txt");

            DataInputStream in = new DataInputStream(fitream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                x[i] = Integer.parseInt(strLine);
                i++;
            }
            in.close();
        } catch (Exception e) {

            System.err.println( e.getMessage());
        }

    }
}