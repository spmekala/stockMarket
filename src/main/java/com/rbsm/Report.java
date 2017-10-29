package com.rbsm;

import java.util.HashMap;

public class Report {

    public String adsh;
    public String name;
    public HashMap<String, String> data;

    public Report(String adsh, String name) {
        this.adsh = adsh;
        this.name = name;
        data = new HashMap<String, String>();
    }

    public void addValue(String tag, String value) {
        data.put(tag, value);
    }
}
