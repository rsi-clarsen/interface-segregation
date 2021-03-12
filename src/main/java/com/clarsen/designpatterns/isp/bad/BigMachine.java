package com.clarsen.designpatterns.isp.bad;

import com.clarsen.designpatterns.isp.model.Document;

public class BigMachine implements Machine {

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
    }

    @Override
    public void fax(Document d) {
    }
}
