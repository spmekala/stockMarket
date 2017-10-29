package com.rbsm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Parser {
    private static File sub = new File("../../../res/sub.tsv");
    private static File num = new File("../../../res/num.tsv");

    public static HashMap<String, Report> readSubFile() {
        try {
            HashMap<String, Report> reports = new HashMap<String, Report>();
            Scanner subScan = new Scanner(sub);
//            Scanner numScan = new Scanner(num);

            while (subScan.hasNextLine()) {
                String line = subScan.nextLine();
                String[] splitLine = line.split("\t");
                reports.put(splitLine[0], new Report(splitLine[0], splitLine[2]));

//                line = numScan.nextLine();
//                splitLine = line.split("\t");
//                reports.getFirst().addValue(splitLine[]);
            }
            return reports;
        } catch (Exception e) {
            System.out.println("Parser Error: " + e.getMessage());
        }
        return null;
    }
}
