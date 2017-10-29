package com.rbsm;

import java.util.HashMap;

public class Report {

    public String adsh;
    public String name;
    public HashMap<String, Double> data;

    public Report(String adsh, String name) {
        this.adsh = adsh;
        this.name = name;
    }

    public void addValue(String tag, double value) {
        data.put(tag, value);
    }
}
