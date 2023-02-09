package class13StringClassStringbuilder;

public class BuilderDemo2 {
    public static void main(String[] args) {

        //If you value speed, use StringBuilder
        //if you value memory, use String

        //famous interview questions: what the difference between String & String Builder
        //what does it mean that String is not immutable
        
        //review notes from this class on GitHub

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(i);
        }
    }
}
