package com.clarsen.designpatterns.isp.good.machines;

import com.clarsen.designpatterns.isp.good.types.Printer;
import com.clarsen.designpatterns.isp.good.types.Scanner;
import com.clarsen.designpatterns.isp.model.Document;

public class Copier implements Printer, Scanner {

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
    }
}
