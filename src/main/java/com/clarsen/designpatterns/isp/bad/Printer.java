package com.clarsen.designpatterns.isp.bad;

import com.clarsen.designpatterns.isp.model.Document;

public class Printer implements Machine {

    @Override
    public void fax(Document d) {
        throw new Error("Fax not available");
    }

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
        throw new Error("Scan not available");
    }
}
