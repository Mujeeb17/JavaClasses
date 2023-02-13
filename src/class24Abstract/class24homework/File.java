package class24Abstract.class24homework;
/*
Create a class File that will have the following behaviors:
open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc
 */
public abstract class File {

    abstract void open();
    void edit(){
        System.out.println("editing file");
    }
    void close(){
        System.out.println("closing file");
    }
}

class JavaFile extends File{
    @Override
    void open(){
        System.out.println("Opening Java file through IntelliJ");
    }
}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("Opening .doc file using Microsoft Word");
    }
}
class PdfFile extends File{
    @Override
    void open(){
        System.out.println("Opening PDF using Adobe Acrobat");
    }
}