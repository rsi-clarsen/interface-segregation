package com.clarsen.designpatterns.isp.bad;

import com.clarsen.designpatterns.isp.model.Document;

public interface Machine {
    void print(Document d);
    void scan(Document d);
    void fax(Document d);
}
