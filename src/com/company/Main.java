package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try(FileWriter fileWriter = new FileWriter("new IO file");) {
            fileWriter.write("A" +
                    "B\n" +
                    "C\n" +
                    "D\n" +
                    "E\n" +
                    "F\n" +
                    "G\n" +
                    "H\n" +
                    "I\n" +
                    "J\n" +
                    "K\n" +
                    "L\n" +
                    "M\n" +
                    "N\n" +
                    "O\n" +
                    "P\n" +
                    "Q\n" +
                    "R\n" +
                    "S\n" +
                    "T\n" +
                    "U\n" +
                    "V\n" +
                    "W\n" +
                    "X\n" +
                    "Y\n" +
                    "Z\n");

            fileWriter.write("0\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" );
        }catch (IOException e){
            System.out.println("something might be wrong");
        }



        try (FileReader fileReader = new FileReader("new IO file")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            System.out.println("something may be wrong while reading");

        }
    }
}
