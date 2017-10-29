package com.rbsm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Parser {
    private static File sub = new File("/Users/raghavbhat/stockMarket/src/res/sub.tsv");
    private static File num = new File("/Users/raghavbhat/stockMarket/src/res/num.tsv");

    public static HashMap<String, Report> readSubFile() {
        try {
            HashMap<String, Report> reports = new HashMap<String, Report>();
            Scanner subScan = new Scanner(sub);

            while (subScan.hasNextLine()) {
                String line = subScan.nextLine();
                String[] splitLine = line.split("\t");
                reports.put(splitLine[0], new Report(splitLine[0], splitLine[2]));
            }

            return reports;
        } catch (Exception e) {
            System.out.println("Sub parser Error: " + e.getMessage());
        }
        return null;
    }

    public static void readNumFile(HashMap<String, Report> reports) {
        try {
            Scanner scan = new Scanner(num);
            scan.nextLine();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splitLine = line.split("\t");
//                    System.out.println("\nadsh: " + splitLine[0] +"\ttag: " + splitLine[1] + "\tval: " + splitLine[8]);
                if (splitLine.length > 8)
                    reports.get(splitLine[0]).addValue(splitLine[1], splitLine[8]);
            }

        } catch (Exception e) {
            System.out.println("Num parser Error: " + e.getMessage() + e.toString());
        }
    }
}
