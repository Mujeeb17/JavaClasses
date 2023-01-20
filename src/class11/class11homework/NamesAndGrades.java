package class11.class11homework;
/*
3) Create a 2D array(shorter way) in which first array will consist of
4 names and second array will contain grades. Then your program
should print name of the students that has A and B grade
 */
public class NamesAndGrades {
    public static void main(String[] args) {

        String[][] ng = {{"Bob","Joe","Joel","Jada"}, {"C","F","A","B"}};

        for (int i = 0; i < ng[0].length; i++) {
            if(ng[1][i].equals("A")|| ng[1][i].equals("B")){
                System.out.println(ng[0][i]);
            }
        }
    }
}
