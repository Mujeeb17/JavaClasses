package class10ForEach2DArray;

public class D2Arrays2 {
    public static void main(String[] args) {

        //easier way to visualise the 2D array
        //like x and y axis on a graph
        int [][] matrix = { {10,20,30},
                            {55,22,45,50},
                            {100,220,450}

        };

       // System.out.println(matrix[2][1]);
       // System.out.println(Arrays.toString(matrix[1]));

        //matrix.length will give you 3 because theres 3 rows
        for (int i = 0; i < matrix.length; i++) {
            //matrix[i].length will give you the size of each individual array
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);

            }

        }
    }
}
