package com.clarsen.designpatterns.isp.good.machines;

import com.clarsen.designpatterns.isp.good.types.Print;
import com.clarsen.designpatterns.isp.good.types.Scan;
import com.clarsen.designpatterns.isp.model.Document;

public class Copier implements Print, Scan {

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
    }
}
