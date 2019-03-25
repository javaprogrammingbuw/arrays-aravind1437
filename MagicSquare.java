public class MagicSquare{

    static int rowSum1,rowSum2,rowSum3,rowSum4;
               
    static int columnSum1,columnSum2,columnSum3,columnSum4;

               public static void main(String [] args)

                 {

        int square[][]={{4,5,4,8},{5,6,2,7}, {9,3,7,23},{23,3,8,3}};

          // get each rows total
        for (int i =0; i < 4;i++){

        	rowSum1 += square[0][i];

        }

        for (int i =0; i < 4;i++){

            rowSum2 += square[1][i];

        }

          for (int i =0; i < 4;i++){

            rowSum3 += square[2][i];

       }

        for (int i =0; i < 4;i++){
        	
         rowSum4 += square[3][i];

        }

        // get each columns totals

        for (int i =0; i < 4;i++){

            columnSum1 += square[i][0];

        }

        for (int i =0; i < 4;i++){

            columnSum2 += square[i][1];

        }

       for (int i =0; i < 4;i++){

            columnSum3 += square[i][2];

        }

      for (int i =0; i < 4;i++){

            columnSum4 += square[i][3];

        }

        // print out, just to make sure it's working correctly

        System.out.println(rowSum1); 

        System.out.println(rowSum2);

        System.out.println(rowSum3);

        System.out.println(rowSum4 + "\n");

        

        System.out.println(columnSum1); 

        System.out.println(columnSum2);

        System.out.println(columnSum3);

        System.out.println(columnSum4);

          if ((rowSum1 == rowSum2) && (rowSum1 == rowSum3) && (rowSum1 == rowSum4) && (rowSum1 == columnSum1)

                && (rowSum1 == columnSum2) && (rowSum1 == columnSum3) && (rowSum1 == columnSum4)){

            System.out.println("Magic square is =");

        } else {

            System.out.println("Not a magic square");

        }

                 }
}
