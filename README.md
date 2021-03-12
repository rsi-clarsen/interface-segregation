# Interface Segregation Principle

The ***interface segregation principle*** states that a client should not be forced to depend on methods that it does not use.  It is better to have multiple smaller interfaces than a single large interface.

## The Bad

Imagine there is some form of a `Document` that can be printed, scanned, faxed, etc etc.  A developer could create the model object and some `Machine` that would allow all the listed behaviors.

[Document](src/main/java/com/clarsen/designpatterns/isp/model/Document.java)
```
public class Document {
}
```

[Machine](src/main/java/com/clarsen/designpatterns/isp/bad/Machine.java)
```
public interface Machine {
    void print(Document d);
    void scan(Document d);
    void fax(Document d);
}
```

[BigMachine](src/main/java/com/clarsen/designpatterns/isp/bad/BigMachine.java)
```
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
```

However; if a client only needs the ability to print the document they would still need to handle the other unnecessary methods.

[Printer](src/main/java/com/clarsen/designpatterns/isp/bad/Printer.java)
```
public class Printer implements Machine {

    @Override
    public void fax(Document d) {
        throw new Error("Fax not available");
    }

    @Override
    public void print(Document d) {
        ......
    }

    @Override
    public void scan(Document d) {
        throw new Error("Scan not available");
    }
}
```

## The Good

It would be better to separate out each of the methods so clients could compose the machine that works best for their needs.  This would make it easier for the client to create the printer.

[Printer](src/main/java/com/clarsen/designpatterns/isp/good/types/Printer.java)
```
public interface Printer {
    void print(Document d);
}
```

[PrinterMachine](src/main/java/com/clarsen/designpatterns/isp/good/machines/PrinterMachine.java)
```
public class PrinterMachine implements Printer {

    @Override
    public void print(Document d) {
    }
}
```

Now it is easier for the client to compose whatever they need without having to worry about what they don't.  Say the client needs something like a copier--something that scans a document and prints it out.

[Copier](src/main/java/com/clarsen/designpatterns/isp/good/machines/Copier.java)
```
public class Copier implements Printer, Scanner {

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
    }
}
```