/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int noOfStudents;
        double tuitionRate;

        Scanner inFile = new Scanner(new FileReader("inFile.txt"));

        PrintWriter outFile = new PrintWriter("sDataOut.out");

        noOfStudents = inFile.nextInt(); //get the number of students
        tuitionRate = inFile.nextDouble(); //get the tuition rate
        Student[] studentList = new Student[noOfStudents];
        System.out.println(noOfStudents + "    " + tuitionRate);
        for (int i = 0; i < studentList.length; i++) {
            studentList[i] = new Student();
        }

        getStudentData(inFile, studentList);
        printGradeReports(outFile, studentList, tuitionRate);
        inFile.close();
        outFile.close();

    }

    private static void getStudentData(Scanner inFile, Student[] studentList) {
        String line = "";
        String stdFirstName;
        String stdLastName;
        String stdID;
        char isTuit;
        int courseCount;
        line = inFile.nextLine();
        while (inFile.hasNextLine()) {
            line = inFile.nextLine();
            System.out.println(line);
            String[] a = line.split(" ");   
            stdFirstName = a[0];
            stdLastName = a[1];
            stdID = a[2];
            isTuit = a[3].charAt(0);
            courseCount = Integer.parseInt(a[4]);
            for (int i = 0; i < courseCount; i++) {
                line = inFile.nextLine();
                System.out.println(line);
            }
            System.out.println("-----------------");
        }

    }

    private static void printGradeReports(PrintWriter outFile, Student[] studentList, double tuitionRate) {

    }

}
