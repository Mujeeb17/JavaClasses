package class24Abstract.class24homework;

public class FileTester {
    public static void main(String[] args) {

        File[] f = {new JavaFile(), new WordFile(), new PdfFile()};

        for (int i = 0; i < f.length; i++){
            f[i].open();
            f[i].edit();
            f[i].close();
        }
    }
}
